# EPass Project
Given the current situation of Covid-19, a lot of citizens are require to travel from one district to another or one state to another state. As travelling is prohibited due to lockdown, each state government is providing e-passes to the citizens having emergency. One such e-pass service is provided by Government of Madhya Pradesh at URL  https://mapit.gov.in/covid-19/ . Please visit this URL and study the procedure of issuing e-pass to the citizens. Suppose you need to build this application by using JSP/servlet. 
 
<h4>1) Provide the database schema (tables and relations) for this project.</h4>
Answer.

<table class="tg">
  <tr>
    <th class="tg-yw4l"><b>ID</b></th>
    <th class="tg-yw4l"><b>Name</b></th>
    <th class="tg-yw4l"><b>Address</b></th>
    <th class="tg-yw4l"><b>MobileNumber</b></th>
    <th class="tg-yw4l"><b>SourceCity</b></th>
    <th class="tg-yw4l"><b>DestinationCity</b></th>
     <th class="tg-yw4l"><b>AadharNumber</b></th>
    <th class="tg-yw4l"><b>VRegistration</b></th>
    <th class="tg-yw4l"><b>PassNo</b></th>
  </tr>
  <tr>
    <td class="tg-yw4l">1</td>
    <td class="tg-yw4l">Aryan</td>
    <td class="tg-yw4l">Krishna Colony</td>
    <td class="tg-yw4l">664538957</td>
    <td class="tg-yw4l">Khandwa</td>
    <td class="tg-yw4l">Indore</td>
    <td class="tg-yw4l">564847352</td>
    <td class="tg-yw4l">14654</td>
    <td class="tg-yw4l">25</td>
  </tr>
  <tr>
    <td class="tg-yw4l">2</td>
    <td class="tg-yw4l">Shobhit</td>
    <td class="tg-yw4l">MR10</td>
    <td class="tg-yw4l">4546384965</td>
    <td class="tg-yw4l">Indore</td>
    <td class="tg-yw4l">Jhabua</td>
    <td class="tg-yw4l">36464356</td>
    <td class="tg-yw4l">35663</td>
    <td class="tg-yw4l">85</td>
</table>

The table represents a unary relation.

 
<h4>2) Describe all the servlet classes and their functionalities that you need to build this project. </h4>
Answer. This application uses GeneratePass servlet class that overrides  doPost(HttpServletRequest request, HttpServletResponse response)  method. doPost() establishes connection with the database and takes user input and generates pass.
 
<h4>3) Describe all the non-servlet java classes and their functionalities that you will use in servlet classes. </h4>
Answer. No non-servlet classes have been used.

 
<h4>4) Describe all the major challenges that you may face to build this project. </h4>

Answer. The data to be inserted cannot be validated.
