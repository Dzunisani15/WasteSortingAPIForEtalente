run the ****WasteSortingApiApplication.java**** to start the API and use

use the following url for waste category http://localhost:8080/api/waste-categories


 ***********************************************************************************WHEN USING POSTMAN FOR TESTING******************************************************************************************

****#to post data to the H2 database****
post: http://localhost:8080/api/waste-categories
      body: {
          "title": "Recycle Paper",
          "description": "Paper can be recycled at designated centers."
      }



****#to get everything in waste-category****
get: http://localhost:8080/api/waste-categories



****#to get waste-category via a id****
get: http://localhost:8080/api/waste-categories/1



****#to delete content via id****
delete: http://localhost:8080/api/waste-categories/1



****#to update to id 1**** 
put: http://localhost:8080/api/waste-categories/1

