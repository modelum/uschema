# The U-Schema metamodel

U-Schema is a unified logical model that integrates the concepts and rules of both the relational model and the four most common NoSQL data models: columnar, document, graph, and key–value.

<figure>
    <img src="es.um.unosql/model/uNoSQLSchemaDiagram.png" align="center"/>
</figure>
<br/>

The repository contains the following projects:

* `es.um.unosql`: The metamodel definition in an ecore file, and the generated java classes for this metamodel.
* `es.um.unosql.utils`: Utilities to handle U-Schema models easily, load and store models.
* `es.um.unosql.design`: A Sirius Viewpoint project to provide a visual representation of U-Schema models.
