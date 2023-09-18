# Design Document
## Introduction
### Have you ever looked up at night and wondered what stars and planets are visible? Our app allows users to plug in their current location to view detailed information about the sky above them. Users can also plugin the coordinates for other locations as well as save locations they have previously viewed.
## Storyboard
 ![Image of Story Board](Pictures/Story%20Board%20v0.1.png)
Users will be able to select the Hemisphere and Time Zone from two dropdown menus. The user will be presented with infomration of all the constellations they can see at that location at the current time. Clicking on a star within that constellation will display more information on that star to the left of the contellation list.
## Functional Requirements
1.  As a User, I want to plug in my current location, so that I can view detailed information about the sky above me.  
<br>  **Given**: The user's current coordinates.  
**When**: The user opens the app.  
**Then**: The app will display the night sky for that user's current location.  
<br>  

2.  As a User, I want to plug in coordinates, so that I can view detailed information about the sky above that location.  
<br>  **Given**: A feed of night sky data is available.  
**When**: The user plugs in "48.8566° N, 2.3522° E".  
**Then**: The app will display information about the night sky above Paris, France.  
<br>

3.  As a User, I want to view my saved locations, So that I can quickly obtain information about the sky above that location.  
<br>  **Given**: A feed of the user's saved locations.  
**When**: The user views their saved locations.  
**Then**: The app will display a list of all of the user's saved locations.  
 <br>  

## Class Diagram
 ![Image of Class Diagram](Pictures/Class%20Diagram%20v0.1.png)
 - Main: Runs the application
 - GUI: Controlls the User Interface
 - Data Collection: Compares User and Star Data
   - User Data: Data about the user
   - Star Data: Data about the stars
 - Location: Collects basic location information
 - Constellation: Collects data about constellations
 - Star: Collects data about stars
## JSON Schema
This is the information we will be exporting:
```
{
    "Type" : "Object",
    "Properties": 
    {
        "Name": {"Type" : "string"},
        "age": {"Type": "integer"},
        "hemisphere": {"Type":"string"},
        "timeZone" : {"Type":"integer"},
        "location": 
            {
                "X": {"Type":"integer"},
                "Y": {"Type":"integer"},
                "Z": {"Type":"integer"}
            }
    }
}
```
## Scrum Roles
### Kelli Porter
  - Roles: Scrum Master / DevOps / Project Owner
  - Email: portekn@mail.uc.edu

### Jackson Pinchot
  - Roles: Integration Developer
  - Email: pinchojd@mail.uc.edu

### Ben Devine
  - Roles: Integration Developer
  - Email: devinebj@mail.uc.edu

### Reesë Tuttle
  - Roles: Frontend Developer
  - Email: tuttlere@mail.uc.edu

## Scrum Board
### Sprint 1
| Week of | Task | Completion |
| --- | --- | --- |
| Sep 11 | Create UI | Pending |
| Sep 18 | Collect User Data | Pending |
| Sep 25 | Collect Star Data | Pending |
| Oct 2 | Unit Testing / Bug Fixes | Pending |
### Sprint 2
| Week of | Task | Completion |
| --- | --- | --- |
| Oct 9 | Compare User and Star Data | Pending |
| Oct 16 | Display Star Data to User | Pending |
| Oct 23 | UI Changes (As Needed) | Pending |
| Oct 30 | Unit Testing / Bug Fixes | Pending |
### Sprint 3
| Week of | Task | Completion |
| --- | --- | --- |
| Nov 6 | Gropup Stars into Constellations | Pending |
| Nov 13 | Display Constellation Data to User | Pending |
| Nov 20 | UI Changes (As Needed) | Pending |
| Nov 27 | Unit Testing / Bug Fixes | Pending |
## Project Link
[Git Repository](https://github.com/BeanDevStudios/Fall_2023_EnterpriseAppDev_Group_4.git)
## Meeting Information
[We will meet on Sunday evenings around 7pm.](https://teams.microsoft.com/l/meetup-join/19%3ameeting_NjkzMDhiNDktNzg3MC00NmEzLTgxZDktNDg4ZDhlOTUzZjVj%40thread.v2/0?context=%7b%22Tid%22%3a%22f5222e6c-5fc6-48eb-8f03-73db18203b63%22%2c%22Oid%22%3a%226c29b11a-c188-43a7-8b61-0224f4f4732c%22%7d)


