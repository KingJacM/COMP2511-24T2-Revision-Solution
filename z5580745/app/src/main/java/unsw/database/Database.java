package unsw.database;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;

import unsw.database.Column.ColumnType;

public class Database {

    private HashMap<String, ColumnType> nameToType = new HashMap<>();
    private List<List<Object>> table = new ArrayList<>(); // index 
    private String[] header;

    public Database(List<Column> columns) {
        
        for (Column c : columns){
            nameToType.put(c.getName(), c.getType());
        }
    }

    // Query is an empty class that you can do whatever you want to (add subclasses/functions/whatever)
    // the only requirement is that the name remains the same.
    public Query parseQuery(String query) {
        // wrapped in an array list to allow us to remove tokens from the "stream"
        // you don't have to change this function.
        return parseOrExpr(new ArrayList<>(Arrays.asList(query.split("\\s"))));
    }

    // Queries database using already compiled Query
    // If a record matches twice you can add it twice (i.e. you don't have to handle distinctly)
    public List<Map<String, Object>> queryComplex(Query query) {
        return new ArrayList<Map<String, Object>>();
        // TODO: ^^
    }

    // Gets the column type for the specified column name
    public ColumnType getColumn(String name) {
        return nameToType.get(name);
    }

    // should return number of new records inserted
    public int ingest(String contents) {
        // split up into rows
        List<String> rows = new ArrayList<>(Arrays.asList(contents.split("\n")));

        // grab the first row for schema
        // NOTE: When splitting on certain characters in java you need to escape them
        //       (this is due to split actually taking in a regex).
        // So if you need to split on `|` you'll want to do `\\|` instead as per below.
        // (you shouldn't need to split on anything else other than newlines as above)
        String[] header = rows.remove(0).split("\\|");

        // trim schema to remove surrounding whitespace
        for (int i = 0; i < header.length; i++){
            header[i] = header[i].trim();
            table.add(new ArrayList<Object>());
        }
        this.header = header;

        for (String row : rows){
            String[] fields = row.split("\\|");
            for (int i = 0; i < fields.length; i++) fields[i] = fields[i].trim();
            for (int j = 0; j < fields.length; j++){
                String field = fields[j];
                try {
                    Integer intField = Integer.parseInt(field);
                    table.get(j).add(intField);
                }
                catch( Exception e ) {
                    table.get(j).add(fields[j]);
                }
                
            }
        }

        // == end of starter code ==
        // TODO: Finish off the rest of this method
        return rows.size();
    }

    // Queries database for all records where columnName has a value that .equals() value.
    public List<Map<String, Object>> querySimple(String columnName, Object value) {
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        int locate = 0;
        for (int i = 0; i < header.length; i++){
            if (header[i].equals(columnName)){
                locate = i;
                break;
            }
        }


        for (int j = 0;  j < this.table.get(locate).size(); j++){
            if (table.get(locate).get(j).equals(value)){
                result.add(getRecord(j));
            }
        }

        return result;
    }

    public Map<String, Object> getRecord(int index){

        Map<String, Object> record = new HashMap<>();
        for (int i = 0; i < header.length; i++){
            record.put(header[i], table.get(i).get(index));
        }

        return record;
    }

    public void updateData(String queryColumnName, Object queryValue, String columnName, Object columnValue) {
        return;
        // TODO: ^^
    }

    public void addDerivedColumn(String columnName, List<String> dependencies, Function<Map<String, Object>, Object> compute) {
        return;
        // TODO: ^^
    }

    /*
        For the following functions you'll want to change them a very tiny amount, you will probably
        be changing the return types and making it so it constructs objects in this said recursive manner.

        To make it simple, the query language presumes all input is valid and doesn't support `()` to decide precedence.

        As a very rough explanation of how this works (it's an exam, you do *NOT* need to understand the specifics just
        focus on changing the return new Query()'s to what you need to construct the query object).

        If you are REALLY struggling look at the practice exam, how did you do the query structure for business rules there?
        How, can you apply that structure to this question in a similar fashion...
     */

    public Query parseAtom(List<String> tokens) {
        if (tokens.size() == 0) {
            return null;
        }

        String tok = tokens.remove(0);
        try {
            // Integer constant
            int result = Integer.parseInt(tok);
            return new Query();
            // TODO: ^^
        } catch (NumberFormatException e) {
            // (ignore)
        }

        // then it must be a String
        // we may have to combine multiple tokens into ones
        String agg = tok.substring(1);
        if (agg.charAt(agg.length() - 1) == '\'') {
            // A string constant.
            String result = agg;
            return new Query();
            // TODO: ^^
        }

        // this is where the text has spaces i.e. 'a b c', what we do is recombine the tokens
        // until we find one with a ' terminator, this isn't a great strategy, but it's simple!
        // this presumes we'll terminate, again we always presume valid input!
        while (true) {
            String next = tokens.remove(0);

            if (next.charAt(next.length() - 1) == '\'') {
                // A string constant.
                String result = agg + " " + next.substring(0, next.length() - 1);
                return new Query();
            } else {
                agg += " " + next;
            }
        }
    }

    public Query parseOperatorExpr(List<String> tokens) {
        if (tokens.size() == 0) {
            return null;
        }

        // we presume we always need at least one operator and since
        // columns can't have boolean values we always need a symbol

        // lhs is the column name
        String lhs = tokens.remove(0);
        // the symbol (i.e. = or >)
        String op = tokens.remove(0);
        // what to compare it to i.e. 'A' or 2
        Query rhs = parseAtom(tokens);

        return new Query();
        // TODO: ^^
    }

    public Query parseAndExpr(List<String> tokens) {
        if (tokens.size() == 0) {
            return null;
        }

        // lhs
        Query lhs = parseOperatorExpr(tokens);

        // read AND
        if (tokens.size() >= 1 && tokens.get(0).equals("AND") && lhs != null) {
            tokens.remove(0);
            // recurse i.e. a AND b AND c => a AND (b AND c)
            Query rhs = parseAndExpr(tokens);

            // you should do something with the results of above...
            // something like X x = new X(lhs, rhs);
            return new Query();
            // TODO:^
        } else {
            return lhs;
        }
    }

    public Query parseOrExpr(List<String> tokens) {
        if (tokens.size() == 0) {
            return null;
        }

        // lhs
        Query lhs = parseAndExpr(tokens);

        // read OR
        if (tokens.size() >= 1 && tokens.get(0).equals("OR") && lhs != null) {
            tokens.remove(0);
            // recurse i.e. a OR b OR c => a OR (b OR c)
            Query rhs = parseOrExpr(tokens);

            // you should do something with the results of above...
            // something like X x = new X(lhs, rhs);
            return new Query();
            // TODO:^
        } else {
            return lhs;
        }
    }
}
