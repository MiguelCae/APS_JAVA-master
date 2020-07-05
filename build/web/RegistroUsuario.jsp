<%-- 
    Document   : RegistroUsuario
    Created on : 25-jun-2020, 21:14:19
    Author     : MIGUEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Page Title - SB Admin</title>
        <link href="css/styles.css" rel="stylesheet" />
        <link href="css/bootstrap-4.5.0-dist/css/bootstrap.css" rel="stylesheet" />
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/js/all.min.js" crossorigin="anonymous"></script>
        <title>Login APS</title>
    </head>
    <body class="bg-dark">
        <div id="layoutAuthentication">
            <div id="layoutAuthentication_content">
                <main>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-9">
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header"><h3 class="text-center font-weight-light my-4">Registrarse</h3></div>
                                    <div class="card-body">
                                        <form action="RegistroUsuariosController" method="POST">
                                            <div class="form-row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblidentificacion">Identificación</label>
                                                        <input class="form-control py-2" name="txtIdentificacion" type="text" placeholder="Ingrese número de identificación" />
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblTipoIdentificacion">Seleccione identificación</label>
                                                        <select class="form-control py-2" name="txtIdentificacion">
                                                            <option value="1">Seleccione</option> 
                                                            <option value="3">Cédula de ciudadanía</option> 
                                                            <option value="3">Cédula de ciudadanía</option> 
                                                            <option value="4">Cédula de extranjería</option>
                                                            <option value="5">PA - Pasaporte</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="small mb-1" for="lblNombresEmailAddress">Nombres</label>
                                                <input class="form-control py-2" name="txtNombres" type="text"  placeholder="Ingresar nombres" />
                                            </div>
                                            <div class="form-row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblPrimerApellido">Primer apellido</label>
                                                        <input class="form-control py-2" name="txtPrimerApellido" type="text" placeholder="Ingresar primer apellido" />
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblSegundoApellido">Segundo apellido</label>
                                                        <input class="form-control py-2" name="txtSegundoApellido" type="text" placeholder="Ingresar segundo apellido" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblEmail">Correo electrónico</label>
                                                        <input class="form-control py-2" name="txtEmail" type="email" placeholder="Ingresar correo electrónico" />
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblTelefono">Teléfono</label>
                                                        <input class="form-control py-2" name="txtTelefono" type="text" placeholder="Ingresar Teléfono" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblContraseña">Contraseña</label>
                                                        <input class="form-control py-2" name="txtContraseña" type="password" placeholder="Ingresar contraseña" />
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblConfirmContraseña">Confirmar contraseña</label>
                                                        <input class="form-control py-2" name="txtConfirmContraseña" type="password" placeholder="Confirmar contraseña" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group mt-4 mb-0">
                                                <input type="submit" class="btn btn-primary btn-block" name="btnAceptar" heref="index.jsp" values="Crear cuenta"/>
                                            </div>
                                        </form>
                                    </div>
                                    <div class="card-footer text-center">
                                        <div class="small"><a href="login.jsp">Si ya tienes una cuenta, ingresa</a></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
            <div id="layoutAuthentication_footer">
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Your Website 2020</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
    </body>
</html>
