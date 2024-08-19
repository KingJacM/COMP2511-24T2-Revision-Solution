# Airline
Consider an airline booking system with the following requirements.
- Passengers have schedules that involve at least one and maybe several flights.
- Each flight has a departure date/time and an arrival date/time.
- Flights are identified by a name (e.g. QF1) that may be repeated for different days/times.
- Flights have a number of seats in several sections: first, business and economy class.
- Each flight in each passenger's schedule includes the class of seat for that flight.
- Each flight has a seat allocated for each of its passengers
- The seat allocated to a passenger on a flight must match the seat class in the schedule. Passengers may book, cancel or update flights and seat allocations in their schedule.

Model the domain for the above requirements to form the basis of a potential software solution. Your answer should include:
- Class Signatures, including inheritance relationships where appropriate
- Method Signatures
- Interfaces
- Key Fields and relationships, including aggregations, compositions and cardinalities between entities

**You do not need to implement any of these classes/methods, you are simply providing the prototypes/stubs**. Any design decisions that you feel need justifying you can do so as a comment/JavaDoc in the respective file

A controller for the entire system has been provided to you in `AirlineBookingSystemController.java`. You can modify these methods prototypes if you like, though you shouldn't need to.

There is a *lot* of undefined behaviour about this system, which is intentional. You can make as many assumptions as you need, so long as they don't reduce the scope of the specification.

You will be assessed on:
- Modelling of Entities (3 marks)
- Inheritance & Interface Design (2 marks)
- Aggregations, Compositions and Cardinalities (3 marks)
- Modelling of Functionality (2 marks)