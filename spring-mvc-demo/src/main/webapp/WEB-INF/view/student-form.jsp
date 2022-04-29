<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!Doctype html>
<html>
    <head>
        <title>Student Registration Form</title>
    </head>

    <body>
        <form:form action="processForm" modelAttribute="student">
            First name: <form:input type="text" path="firstName"/>
            <br><br>
            Last name: <form:input type="text" path="lastName"/>
            <br><br>
            Country:
            <form:select path ="country">
                <form:options items="${student.countryOptions}" />

            </form:select>

            <br><br>

            Favourite Language:
            Java <form:radiobutton path="favoriteLanguage" value="Java" />
            C# <form:radiobutton path="favoriteLanguage" value="C#" />
            PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
            Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

            <br><br>

            Operating Systems:
            Linux <form:checkbox path="operatingSystems" value="Linux" />
            Mac os <form:checkbox path="operatingSystems" value="Mac OS" />
            MS Windows <form:checkbox path="operatingSystems" value="MS Window" />
            <br><br>
            <input type="submit" value="Submit"/>
        </form:form>
    </body>
</html>