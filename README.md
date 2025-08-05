# 🦁 zoologico-mamiferos-java

Proyecto educativo en Java que simula un sistema de administración de mamíferos en un zoológico utilizando **programación orientada a objetos (POO)**, **herencia**, **clases abstractas** y **polimorfismo**.

## 🧠 Descripción

Este proyecto implementa una jerarquía de clases para representar distintos tipos de mamíferos: **leones, tigres, guepardos, lobos y perros**. Se organiza a través de clases abstractas comunes como `Mamifero`, `Felino` y `Canino`.

Cada clase concreta sobrescribe los métodos abstractos `comer()`, `dormir()`, `correr()` y `comunicarse()`, devolviendo mensajes únicos que reflejan el comportamiento del animal en su entorno natural.

## 🏗️ Estructura de clases

```
Mamifero (abstract)
├── Felino (abstract)
│   ├── Leon
│   ├── Tigre
│   └── Guepardo
└── Canino (abstract)
    ├── Lobo
    └── Perro
```

## 📂 Paquetes

- `org.ismaelg.project.mamiferos`
- `org.ismaelg.project.mamiferos.felino`
- `org.ismaelg.project.mamiferos.canino`

## ✨ Funcionalidades

- Declaración de clases abstractas y métodos que deben ser implementados.
- Sobrescritura de métodos para comportamientos personalizados.
- Almacenamiento de objetos en una lista genérica `List<Mamiferos>`.
- Impresión de la información general y comportamiento individual de cada animal.

## 📌 Ejemplo de uso

```java
Leon leonAfricano = new Leon("Sabana africana", 1.2f, 2.5f, 190.0f, "Panthera leo", 7.5f, 80, 15, 114.0f);
System.out.println(leonAfricano.comer());
```

Salida esperada:
```
El león de 190.0 kg caza junto a su manada de 15 miembros en Sabana africana.
```

## 🧪 Tecnologías usadas

- Java 17+ (Compatible hasta Java 23)
- IntelliJ IDEA (opcional)
- Git para control de versiones

## 🧑‍💻 Autor

**Ismael García Aquino**  
📧 ismaelgar336@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/ismael-garc%C3%ADa-aquino/)  
🐙 [GitHub](https://github.com/IsmaelGarcia2)

## 🗃️ Licencia

Este proyecto es de uso educativo y personal. No posee licencia de distribución abierta.

