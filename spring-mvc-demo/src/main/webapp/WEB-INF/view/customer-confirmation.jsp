<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!Doctype html>
<html>
    <head>
        <title>Customer Confirmation</title>
    </head>

    <body>
        The customer is confirmed: ${customer.firstName} ${customer.lastName}

        <br><br>

        Free Passes: ${customer.freePasses}

        <br><br>

        Postal Code: ${customer.postalCode}

        <br><br>

         Couse Code: ${customer.courseCode}
    </body>

</html>