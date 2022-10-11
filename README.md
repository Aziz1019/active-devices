# active-devices
Controlling sessions of devices, and deleting sessions which we do not want to be active anymore. 
Using JWT, Spring Secutiry, Spring Data JPA

After running the project, modify the table refreshtoken on action - cascade, so when the device is deleted, 
the refresh token row attached to the device table should also be deleted.

# Login and get device access-token

![image](https://user-images.githubusercontent.com/64957760/195020548-8c121c2a-4178-41be-8a75-3dd362072c70.png)

![image](https://user-images.githubusercontent.com/64957760/195020670-266a4608-82c2-4071-84c4-504ff53da2d4.png)


# Using token with Bearer auth to access the paths

![image](https://user-images.githubusercontent.com/64957760/195021132-77b53d1f-bf03-43a6-a7f1-32bfce2c921c.png)

# Accessing Data getting all active devices

![image](https://user-images.githubusercontent.com/64957760/195021449-ef5e729d-9b6f-44bf-97b1-4542e23ff0fd.png)

# Deleting device by specifying the id

![image](https://user-images.githubusercontent.com/64957760/195021736-0dd36943-7293-41ff-8993-f0bfff7823cd.png)

# Trying to access the token that was deleted

![image](https://user-images.githubusercontent.com/64957760/195022243-ca20e8ac-c71e-42bc-a0b5-e12a59fea992.png)
