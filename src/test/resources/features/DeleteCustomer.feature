#language: es
Característica: HU-003 Delete Customer

  Yo como usuario
  Quiero eliminar un cliente
  Para borrarlo de la aplicacion

  Antecedentes:
    Dado que estoy en la pagina de guru99
    Cuando ingreso mi usuario y clave respectiva
      | usuario    | clave       |
      | mngr455499 | Sistemas12* |

  @DeleteCostumer
  Esquema del escenario: como usuario entro a Eliminar un customer
    Cuando tengo el id para eliminar
      | idCustomer   |
      | <IdCustomer> |
    Entonces  deberia eliminar el usuario
    Ejemplos:
    # Otro ejemplo profe 22434
      | IdCustomer |
      | 9857       |

