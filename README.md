# Metodologias-Avanzadas
Integrantes 

Alinson Bridgeth Correa
Jonathan Andrés Vanegas Herrera 
Karen Yulieth Rodríguez Baez 
Fabian David Merentes Fraile 
Juan Sebastián Muñoz Riveros
  

Herramientas Utilizadas: 


	Selenium web driver 
	serenity 
	gradle 
	intellij ide 
	GitHub 
	Java JDK 8

  

¿Que hace la aplicación? 

se creó un banco de pruebas para el testeo de una página web diseñada para ese propósito. las cuales se intervienen en los módulos de login, changepassword, editcostumer, deletcustumer, newcustomer y new account. 

procediendo con la automatización de dichos módulos. 

  

Instrucciones. 

para ejecutar un test nos dirigimos a los runners y escogemos el que queremos ejecutar. 


 ![image](https://user-images.githubusercontent.com/85239699/202567818-978bb65a-4e2c-4e32-a473-a95aa9d193ef.png)


(automáticamente el ejecuta la prueba). 

 

BREVE Explicación  
 

Se crean test con un patrón de diseño POM 

Es cual va Page Objet Model 

Dentro del Page van los selectores de los inputs o botones a interactuar  

 ![image](https://user-images.githubusercontent.com/85239699/202568000-fd952922-096c-443a-8dfe-5500742a5eaf.png)


Object va la lógica en este caso serían los pasos que tiene que hacer en la plataforma y toma los selectores de referencia donde ingresa los datos o da clic. 

Model van los actores que intervienen en la ejecución de la prueba y se crea un constructor con los datos de este. 

 ![image](https://user-images.githubusercontent.com/85239699/202568091-bfa18c69-1519-4863-9618-690ebd057ce9.png)


 Para la documentación y el entendimiento o uso de lenguaje Jenkins se usan los stepdefinitions que son donde se definen los pasos que interpreta Jenkins. 

 
![image](https://user-images.githubusercontent.com/85239699/202568304-7365ec96-9c5a-4d78-ad75-b6f034bd645c.png)

Y por último se usan los Features que son donde va la historia de usuario y sus escenarios. 

 
![image](https://user-images.githubusercontent.com/85239699/202568343-59982a5f-7219-40a1-8eac-4770471904d4.png)

 

Ya para ver el Reporte que genera gradle se abre desde la carpeta target y en index.(tener en cuenta borrar antes la carpeta target para ver los últimos) y haber ejecutado las pruebas 

 
![image](https://user-images.githubusercontent.com/85239699/202568404-c6d72ee0-b504-4099-9a92-126acfa72c8a.png)

 

Conclusión   

Jenkins para el tema de pruebas es de gran ayuda debido aque permite tener un control de tus pruebas y documentación de estas como constancia de las Historias de usuario, más que sirven para que lo pueda entender la gran mayoría de las personas. 
