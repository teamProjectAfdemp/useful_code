import java.sql.Date;
...
// LOCAL DATE -> SQL DATE
LocalDate locald = LocalDate.of(1967, 06, 22);
Date date = Date.valueOf(locald); // Magic happens here!
r.setDateOfBirth(date);

// SQL DATE -> LOCAL DATE 
Date date = r.getDate();
LocalDate localD = date.toLocalDate();


//Just make a new Date object with the stamp's getTime() value as a parameter.
//Here's an example (I use an example timestamp of the current time):

Timestamp stamp = new Timestamp(System.currentTimeMillis());
Date date = new Date(stamp.getTime());

