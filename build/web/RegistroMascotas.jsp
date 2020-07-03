<%-- 
    Document   : RegistroMascotas
    Created on : 02-jul-2020, 22:13:58
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
        <title>Registrar Mascota</title>
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
                                    <div class="card-header"><h1 class="text-center font-weight-light my-4">Registrar Mascota</h1></div>
                                    <div class="card-body">
                                        <form>
                                            <div class="form-row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblIdMascota">Fecha registro</label>
                                                        <input class="form-control py-2" name="txtIdentificacion" type="date" placeholder="Ingrese número de identificación" />
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblIdMascota">Id Mascota</label>
                                                        <input class="form-control py-2" name="txtIdentificacion" type="text" placeholder="Ingrese número de identificación" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="small mb-1" for="lblNombresEmailAddress">Nombre Mascota</label>
                                                <input class="form-control py-2" name="txtNombres" type="text"  placeholder="Ingresar nombre de la Mascota" />
                                            </div>
                                            <div class="form-row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblSegundoApellido">Especie</label>
                                                        <select class="form-control py-2" name="txtSegundoApellido" type="text" placeholder="Ingresar segundo apellido">
                                                            <option>Seleccione</option>
                                                            <option>Gato</option>
                                                            <option>Perro</option>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblPrimerApellido">Raza</label>
                                                        <input class="form-control py-2" name="txtPrimerApellido" type="text" placeholder="" />
                                                    </div>
                                                </div>

                                            </div>
                                            <div class="form-row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblEmail">Sexo</label>
                                                        <select class="form-control py-2" name="txtSegundoApellido" type="text" placeholder="Ingresar segundo apellido">
                                                            <option>Seleccione</option>
                                                            <option>Macho</option>
                                                            <option>Hembra</option>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblTelefono">Edad</label>
                                                        <input class="form-control py-2" name="txtTelefono" type="text" placeholder="Aproximada en años" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblContraseña">Peso</label>
                                                        <input class="form-control py-2" name="txtContraseña" type="texto" placeholder="Ingresar peso en kilogramos" />
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblConfirmContraseña">Tamaño</label>
                                                        <select class="form-control py-2" name="txtSegundoApellido" type="text" placeholder="Seleccionar tamaño">
                                                            <option>Seleccione</option>
                                                            <option>Pequeño</option>
                                                            <option>Mediano</option>
                                                            <option>Grande</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group mt-4 mb-0">
                                                <input type="submit" class="btn btn-success btn-block" name="btnAceptar" href="#" values="Crear cuenta"/>
                                            </div>
                                        </form>
                                    </div>
                                    <div class="card-footer text-center">
                                        <a href="Index.jsp" class="btn btn-primary" name="btnAceptar" href="#" values="Crear cuenta">Regresar</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
            <div id="layoutAuthentication_footer">
                <footer class="py-2 bg-light mt-auto">
                    <div class="container-fluid">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Adoption Pet System 2020</div>
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
