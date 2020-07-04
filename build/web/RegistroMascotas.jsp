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
        <link href="css/sweetalert.css" rel="stylesheet"/>
        <script src="js/sweetalert.min.js" type="text/javascript"/>
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
                                        <form action="" method="POST">
                                            <div class="form-row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblFecha">Fecha registro</label>
                                                        <input class="form-control py-2" name="txtFecha" type="date" placeholder="Ingrese número de identificación" required="" />
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblIdMascota">Id Mascota</label>
                                                        <input class="form-control py-2" name="txtIdMascota" type="text" placeholder="Ingrese número de identificación" required="" />
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="small mb-1" for="lblNombreMascota">Nombre Mascota</label>
                                                <input class="form-control py-2" name="txtNombreMascota" type="text"  placeholder="Ingresar nombre de la Mascota" required="" />
                                            </div>
                                            <div class="form-row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblEspecie">Especie</label>
                                                        <select class="form-control py-2" name="ddlEspecie" type="text" placeholder="Ingresar segundo apellido" required="">
                                                            <option value="1">Seleccione</option>
                                                            <option value="2">Gato</option>
                                                            <option value="3">Perro</option>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblRaza">Raza</label>
                                                        <input class="form-control py-2" name="txtRaza" type="text" placeholder="" required="" />
                                                    </div>
                                                </div>

                                            </div>
                                            <div class="form-row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblSexo">Sexo</label>
                                                        <select class="form-control py-2" name="ddlSexo" type="text" placeholder="Ingresar segundo apellido" required="">
                                                            <option value="1">Seleccione</option>
                                                            <option value="2">Macho</option>
                                                            <option value="3">Hembra</option>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblEdad">Edad</label>
                                                        <input class="form-control py-2" name="txtEdad" type="text" placeholder="Aproximada en años" required=""/>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-row">
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblPeso">Peso</label>
                                                        <input class="form-control py-2" name="txtPeso" type="texto" placeholder="Ingresar peso en kilogramos" required=""/>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-group">
                                                        <label class="small mb-1" for="lblTamaño">Tamaño</label>
                                                        <select class="form-control py-2" name="ddlTamaño" type="text" placeholder="Seleccionar tamaño" required="">
                                                            <option value="1">Seleccione</option>
                                                            <option value="2">Pequeño</option>
                                                            <option value="3">Mediano</option>
                                                            <option value="4">Grande</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group mt-4 mb-0">
                                                <input type="submit" class="btn btn-success btn-block" name="btnAceptar" href="#" values="Enviar"/>
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
