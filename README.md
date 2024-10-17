# Taller02Solid

Viola el Single Responsibility Principle (SRP):

Clases Afectadas:
LogIn: Esta clase tiene la responsabilidad de gestionar el inicio de sesión y también de insertar usuarios en la base de datos. Debería ser responsable solo del inicio de sesión.
LogInAdmin: Al igual que LogIn, esta clase también está manejando la verificación del usuario y la lógica de inicio de sesión, lo que implica múltiples responsabilidades.
AppWeb: La clase AppWeb está manejando la lógica de conexión a la base de datos y el inicio de sesión, lo que también viola el SRP.

Viola el Open/Closed Principle (OCP):

Clases Afectadas:
LogIn y LogInAdmin: Si se desea agregar un nuevo tipo de inicio de sesión (por ejemplo, LogInOAuth), se tendría que modificar la clase existente o crear una nueva, lo que no es ideal. Deberían estar diseñadas para extenderse sin modificar el código existente.

Viola el Liskov Substitution Principle (LSP):

Clases Afectadas:
LogInAdmin: Esta clase hereda de LogIn, pero su comportamiento no es completamente sustituible. Si se usa un objeto de LogInAdmin en lugar de LogIn, es posible que no se obtenga el mismo comportamiento esperado, especialmente si el usuario no es un administrador. Esto puede causar comportamientos inesperados en el sistema.

Viola el Dependency Inversion Principle (DIP):

Clases Afectadas:
AppWeb: La clase AppWeb depende directamente de la implementación de MySQL. Esto significa que cualquier cambio en la implementación de la base de datos requeriría cambios en AppWeb. En su lugar, debería depender de una abstracción (como una interfaz Database) para permitir la flexibilidad y facilitar las pruebas.

