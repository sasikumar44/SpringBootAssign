# SpringBootAssign

PROJECT API [one to many]-join with DEFECT Table


http://localhost:8081/defect/api/v1/project	


POST,GET,PUT,DELETE	
JSON FORMAT SAMPLE DATA


{
"projectname":"First project",
	
"projectdesc":"new Project "

}







DEFECT API [many to one]-join with PROJECT Table


http://localhost:8081/defect/api/v1/defect


POST,GET,PUT,DELETE
JSON FORMAT SAMPLE DATA


{

"defect": "defect1",

"defectdesc": "develop Error",
        
"project": {
            
"id": 5
            
        
	   }
    
}








MODULE API [many to many]-join with EMPLOYEE Table


http://localhost:8081/defect/api/v1/module


POST,GET,PUT,DELETE
JSON FORMAT SAMPLE DATA


 {
 		
        
"modelname": "Register",
        
"modeldesc": "User Registration"
 
}






EMPLOYEE API[many to many]-join with MODULE Table


http://localhost:8081/defect/api/v1/employee


POST,GET,PUT,DELETE
JSON FORMAT SAMPLE DATA


{
     
        
"name": "Kumar",
        
"nic": "951523699V",
        
"dateofbrith": "04051995",
        
"address": "jaffna"
    
}
