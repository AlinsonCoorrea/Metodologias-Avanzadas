#language: es
Característica: HU-003 Change Password

  Yo como usuario
  Quiero ingresar a guru
  Para realizar cambio de contraseña

  Antecedentes:
    Dado que estoy en la pagina de guru99
    Cuando ingreso mi usuario y clave respectiva
      | usuario    | clave       |
      | mngr455013 | Sistemas12* |

  @ChangePassword
  Esquema del escenario: como usuario entro a cambio de contraseña
    Cuando cuando ingreso la contraseña anterior y agrego la nueva
      | oldpassword   | newpassword   | confirmpassword   |
      | <Oldpassword> | <Newpassword> | <Confirmpassword> |
    Entonces  deberia ver el cambio de contraseña
    Ejemplos:
      | Oldpassword | Newpassword | Confirmpassword |
      | Sistemas12* | Sistemas11  | Sistemas11      |

