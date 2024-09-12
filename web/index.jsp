<%-- 
    Document   : index
    Created on : 12/09/2024, 2:38:47 p. m.
    Author     : Eric Alvarez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Iniciar Sesion</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body>
        
        
            <main class="bg-purple-500 w-screen h-screen flex items-center justify-center  ">
        
              <section class="w-[350px] bg-white h-[500px] rounded-[8px] flex flex-col items-center justify-center" >
                <img src="./images/logo.png" class="w-[230px] h-[220]" alt="">

                <form action="Login" class=" w-3/4 h-2/4  flex flex-col pt-[10px]"  method="POST">
                    
                    <input class="my-[10px] bg-gray-100 p-[8px]" type="text" placeholder="usuario" name="usuario" >
                    <input class=" p-[8px] bg-gray-100" type="password" placeholder="contrasena" name="contrasena">
                    
                    <button type="submit" class="my-[10px] text-white	 bg-purple-500 p-[8px]">Iniciar Sesion</button>
                    
                </form>



                <div class="flex text-[10px]">

                    <p class="px-[5px]">olvidaste tu contrasena?</p>
                   

                </div>

                </section>

               </main>

        
    </body>
</html>
