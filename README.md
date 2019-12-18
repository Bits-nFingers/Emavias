<!doctype html>
<html>
  <head>
    <title>EMAVIAS</title>
    <style type="text/css">
      body {
	font-family: Trebuchet MS, sans-serif;
	font-size: 15px;
	color: #444;
	margin-right: 24px;
}

h1	{
	font-size: 25px;
}
h2	{
	font-size: 20px;
}
h3	{
	font-size: 16px;
	font-weight: bold;
}
hr	{
	height: 1px;
	border: 0;
	color: #ddd;
	background-color: #ddd;
}

.app-desc {
  clear: both;
  margin-left: 20px;
}
.param-name {
  width: 100%;
}
.license-info {
  margin-left: 20px;
}

.license-url {
  margin-left: 20px;
}

.model {
  margin: 0 0 0px 20px;
}

.method {
  margin-left: 20px;
}

.method-notes	{
	margin: 10px 0 20px 0;
	font-size: 90%;
	color: #555;
}

pre {
  padding: 10px;
  margin-bottom: 2px;
}

.http-method {
 text-transform: uppercase;
}

pre.get {
  background-color: #0f6ab4;
}

pre.post {
  background-color: #10a54a;
}

pre.put {
  background-color: #c5862b;
}

pre.delete {
  background-color: #a41e22;
}

.huge	{
	color: #fff;
}

pre.example {
  background-color: #f3f3f3;
  padding: 10px;
  border: 1px solid #ddd;
}

code {
  white-space: pre;
}

.nickname {
  font-weight: bold;
}

.method-path {
  font-size: 1.5em;
  background-color: #0f6ab4;
}

.up {
  float:right;
}

.parameter {
  width: 500px;
}

.param {
  width: 500px;
  padding: 10px 0 0 20px;
  font-weight: bold;
}

.param-desc {
  width: 700px;
  padding: 0 0 0 20px;
  color: #777;
}

.param-type {
  font-style: italic;
}

.param-enum-header {
width: 700px;
padding: 0 0 0 60px;
color: #777;
font-weight: bold;
}

.param-enum {
width: 700px;
padding: 0 0 0 80px;
color: #777;
font-style: italic;
}

.field-label {
  padding: 0;
  margin: 0;
  clear: both;
}

.field-items	{
	padding: 0 0 15px 0;
	margin-bottom: 15px;
}

.return-type {
  clear: both;
  padding-bottom: 10px;
}

.param-header {
  font-weight: bold;
}

.method-tags {
  text-align: right;
}

.method-tag {
  background: none repeat scroll 0% 0% #24A600;
  border-radius: 3px;
  padding: 2px 10px;
  margin: 2px;
  color: #FFF;
  display: inline-block;
  text-decoration: none;
}

    </style>
  </head>
  <body>
  <h1>EMAVIAS</h1>
    <div class="app-desc">SOFTWARE DE ALMACENES</div>
    <div class="app-desc">More information: <a href="http://bitsnfinger.com">http://bitsnfinger.com</a></div>
    <div class="app-desc">Contact Info: <a href="bits'nfinger@gmai.com">bits'nfinger@gmai.com</a></div>
    <div class="app-desc">Version: 1.0.0</div>
    <div class="app-desc">BasePath:/Bits-nFingers/emavias2/1.0.0</div>
    <div class="license-info">API license</div>
    <div class="license-url">http://api.com</div>
  <h2>Access</h2>

  <h2><a name="__Methods">Methods</a></h2>
  [ Jump to <a href="#__Models">Models</a> ]

  <h3>Table of Contents </h3>
  <div class="method-summary"></div>
  <h4><a href="#InventarioController">InventarioController</a></h4>
  <ul>
  <li><a href="#deleteInventarioUsingDELETE"><code><span class="http-method">delete</span> /inventario/{id}</code></a></li>
  <li><a href="#getInventarioUsingGET"><code><span class="http-method">get</span> /inventario/{id}</code></a></li>
  <li><a href="#saveInventarioUsingPOST"><code><span class="http-method">post</span> /inventario</code></a></li>
  <li><a href="#updateInventarioUsingPUT"><code><span class="http-method">put</span> /inventario/{id}</code></a></li>
  </ul>
  <h4><a href="#PersonalController">PersonalController</a></h4>
  <ul>
  <li><a href="#deletePersonalUsingDELETE"><code><span class="http-method">delete</span> /personal/{id}</code></a></li>
  <li><a href="#getPersonalUsingGET"><code><span class="http-method">get</span> /personal/{id}</code></a></li>
  <li><a href="#savePersonalUsingPOST"><code><span class="http-method">post</span> /personal</code></a></li>
  <li><a href="#updatePersonalUsingPUT"><code><span class="http-method">put</span> /personal/{id}</code></a></li>
  </ul>
  <h4><a href="#ResponsableController">ResponsableController</a></h4>
  <ul>
  <li><a href="#deleteResponsableUsingDELETE"><code><span class="http-method">delete</span> /responsabledealmacen/{id}</code></a></li>
  <li><a href="#getResponsableUsingGET"><code><span class="http-method">get</span> /responsabledealmacen/{id}</code></a></li>
  <li><a href="#saveResponUsingPOST"><code><span class="http-method">post</span> /responsabledealmacen</code></a></li>
  <li><a href="#updateResponsableUsingPUT"><code><span class="http-method">put</span> /responsabledealmacen/{id}</code></a></li>
  </ul>
  <h4><a href="#ResponsableInvenController">ResponsableInvenController</a></h4>
  <ul>
  <li><a href="#deleteResponsableInvenUsingDELETE"><code><span class="http-method">delete</span> /responsabledeinven/{id}</code></a></li>
  <li><a href="#getResponsableUsingGET1"><code><span class="http-method">get</span> /responsabledeinven/{id}</code></a></li>
  <li><a href="#saveResponUsingPOST1"><code><span class="http-method">post</span> /responsabledeinven</code></a></li>
  <li><a href="#updateResponsableUsingPUT1"><code><span class="http-method">put</span> /responsabledeinven/{id}</code></a></li>
  </ul>
  <h4><a href="#TecnicoController">TecnicoController</a></h4>
  <ul>
  <li><a href="#deleteTecnicoUsingDELETE"><code><span class="http-method">delete</span> /tecnico/{id}</code></a></li>
  <li><a href="#getTecnicoUsingGET"><code><span class="http-method">get</span> /tecnico/{id}</code></a></li>
  <li><a href="#saveTecnicoUsingPOST"><code><span class="http-method">post</span> /tecnico</code></a></li>
  <li><a href="#updateTecnicoUsingPUT"><code><span class="http-method">put</span> /tecnico/{id}</code></a></li>
  </ul>

  <h1><a name="InventarioController">InventarioController</a></h1>
  <div class="method"><a name="deleteInventarioUsingDELETE"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="delete"><code class="huge"><span class="http-method">delete</span> /inventario/{id}</code></pre></div>
    <div class="method-summary">deleteInventario (<span class="nickname">deleteInventarioUsingDELETE</span>)</div>
    <div class="method-notes"></div>

    <h3 class="field-label">Path parameters</h3>
    <div class="field-items">
      <div class="param">id (required)</div>

      <div class="param-desc"><span class="param-type">Path Parameter</span> &mdash; id </div>
    </div>  <!-- field-items -->







    <!--Todo: process Response Object and its headers, schema, examples -->


    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#"></a>
    <h4 class="field-label">204</h4>
    No Content
        <a href="#"></a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <div class="method"><a name="getInventarioUsingGET"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="get"><code class="huge"><span class="http-method">get</span> /inventario/{id}</code></pre></div>
    <div class="method-summary">Gets the product with specific id (<span class="nickname">getInventarioUsingGET</span>)</div>
    <div class="method-notes"></div>

    <h3 class="field-label">Path parameters</h3>
    <div class="field-items">
      <div class="param">id (required)</div>

      <div class="param-desc"><span class="param-type">Path Parameter</span> &mdash; id </div>
    </div>  <!-- field-items -->






    <h3 class="field-label">Return type</h3>
    <div class="return-type">
      <a href="#Inventario">Inventario</a>
      
    </div>

    <!--Todo: process Response Object and its headers, schema, examples -->

    <h3 class="field-label">Example data</h3>
    <div class="example-data-content-type">Content-Type: </div>
    <pre class="example"><code></code></pre>

    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#Inventario">Inventario</a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
    <h4 class="field-label">404</h4>
    Not Found
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <div class="method"><a name="saveInventarioUsingPOST"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="post"><code class="huge"><span class="http-method">post</span> /inventario</code></pre></div>
    <div class="method-summary">saveInventario (<span class="nickname">saveInventarioUsingPOST</span>)</div>
    <div class="method-notes"></div>


    <h3 class="field-label">Consumes</h3>
    This API call consumes the following media types via the <span class="header">Content-Type</span> request header:
    <ul>
      <li><code>application/json</code></li>
    </ul>

    <h3 class="field-label">Request body</h3>
    <div class="field-items">
      <div class="param">invToSave <a href="#Inventario">Inventario</a> (required)</div>

      <div class="param-desc"><span class="param-type">Body Parameter</span> &mdash; invToSave </div>

    </div>  <!-- field-items -->




    <h3 class="field-label">Return type</h3>
    <div class="return-type">
      <a href="#Inventario">Inventario</a>
      
    </div>

    <!--Todo: process Response Object and its headers, schema, examples -->

    <h3 class="field-label">Example data</h3>
    <div class="example-data-content-type">Content-Type: </div>
    <pre class="example"><code></code></pre>

    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#Inventario">Inventario</a>
    <h4 class="field-label">201</h4>
    Created
        <a href="#"></a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
    <h4 class="field-label">404</h4>
    Not Found
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <div class="method"><a name="updateInventarioUsingPUT"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="put"><code class="huge"><span class="http-method">put</span> /inventario/{id}</code></pre></div>
    <div class="method-summary">updateInventario (<span class="nickname">updateInventarioUsingPUT</span>)</div>
    <div class="method-notes"></div>

    <h3 class="field-label">Path parameters</h3>
    <div class="field-items">
      <div class="param">id (required)</div>

      <div class="param-desc"><span class="param-type">Path Parameter</span> &mdash; id </div>
    </div>  <!-- field-items -->

    <h3 class="field-label">Consumes</h3>
    This API call consumes the following media types via the <span class="header">Content-Type</span> request header:
    <ul>
      <li><code>application/json</code></li>
    </ul>

    <h3 class="field-label">Request body</h3>
    <div class="field-items">
      <div class="param">inventarioToUpdate <a href="#Inventario">Inventario</a> (required)</div>

      <div class="param-desc"><span class="param-type">Body Parameter</span> &mdash; inventarioToUpdate </div>

    </div>  <!-- field-items -->




    <h3 class="field-label">Return type</h3>
    <div class="return-type">
      <a href="#Inventario">Inventario</a>
      
    </div>

    <!--Todo: process Response Object and its headers, schema, examples -->

    <h3 class="field-label">Example data</h3>
    <div class="example-data-content-type">Content-Type: </div>
    <pre class="example"><code></code></pre>

    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#Inventario">Inventario</a>
    <h4 class="field-label">201</h4>
    Created
        <a href="#"></a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
    <h4 class="field-label">404</h4>
    Not Found
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <h1><a name="PersonalController">PersonalController</a></h1>
  <div class="method"><a name="deletePersonalUsingDELETE"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="delete"><code class="huge"><span class="http-method">delete</span> /personal/{id}</code></pre></div>
    <div class="method-summary">deletePersonal (<span class="nickname">deletePersonalUsingDELETE</span>)</div>
    <div class="method-notes"></div>

    <h3 class="field-label">Path parameters</h3>
    <div class="field-items">
      <div class="param">id (required)</div>

      <div class="param-desc"><span class="param-type">Path Parameter</span> &mdash; id </div>
    </div>  <!-- field-items -->







    <!--Todo: process Response Object and its headers, schema, examples -->


    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#"></a>
    <h4 class="field-label">204</h4>
    No Content
        <a href="#"></a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <div class="method"><a name="getPersonalUsingGET"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="get"><code class="huge"><span class="http-method">get</span> /personal/{id}</code></pre></div>
    <div class="method-summary">Gets the product with specific id (<span class="nickname">getPersonalUsingGET</span>)</div>
    <div class="method-notes"></div>

    <h3 class="field-label">Path parameters</h3>
    <div class="field-items">
      <div class="param">id (required)</div>

      <div class="param-desc"><span class="param-type">Path Parameter</span> &mdash; id </div>
    </div>  <!-- field-items -->






    <h3 class="field-label">Return type</h3>
    <div class="return-type">
      <a href="#Personal">Personal</a>
      
    </div>

    <!--Todo: process Response Object and its headers, schema, examples -->

    <h3 class="field-label">Example data</h3>
    <div class="example-data-content-type">Content-Type: </div>
    <pre class="example"><code></code></pre>

    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#Personal">Personal</a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
    <h4 class="field-label">404</h4>
    Not Found
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <div class="method"><a name="savePersonalUsingPOST"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="post"><code class="huge"><span class="http-method">post</span> /personal</code></pre></div>
    <div class="method-summary">savePersonal (<span class="nickname">savePersonalUsingPOST</span>)</div>
    <div class="method-notes"></div>


    <h3 class="field-label">Consumes</h3>
    This API call consumes the following media types via the <span class="header">Content-Type</span> request header:
    <ul>
      <li><code>application/json</code></li>
    </ul>

    <h3 class="field-label">Request body</h3>
    <div class="field-items">
      <div class="param">personalToSave <a href="#Personal">Personal</a> (required)</div>

      <div class="param-desc"><span class="param-type">Body Parameter</span> &mdash; personalToSave </div>

    </div>  <!-- field-items -->




    <h3 class="field-label">Return type</h3>
    <div class="return-type">
      <a href="#Personal">Personal</a>
      
    </div>

    <!--Todo: process Response Object and its headers, schema, examples -->

    <h3 class="field-label">Example data</h3>
    <div class="example-data-content-type">Content-Type: </div>
    <pre class="example"><code></code></pre>

    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#Personal">Personal</a>
    <h4 class="field-label">201</h4>
    Created
        <a href="#"></a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
    <h4 class="field-label">404</h4>
    Not Found
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <div class="method"><a name="updatePersonalUsingPUT"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="put"><code class="huge"><span class="http-method">put</span> /personal/{id}</code></pre></div>
    <div class="method-summary">updatePersonal (<span class="nickname">updatePersonalUsingPUT</span>)</div>
    <div class="method-notes"></div>

    <h3 class="field-label">Path parameters</h3>
    <div class="field-items">
      <div class="param">id (required)</div>

      <div class="param-desc"><span class="param-type">Path Parameter</span> &mdash; id </div>
    </div>  <!-- field-items -->

    <h3 class="field-label">Consumes</h3>
    This API call consumes the following media types via the <span class="header">Content-Type</span> request header:
    <ul>
      <li><code>application/json</code></li>
    </ul>

    <h3 class="field-label">Request body</h3>
    <div class="field-items">
      <div class="param">personalToUpdate <a href="#Personal">Personal</a> (required)</div>

      <div class="param-desc"><span class="param-type">Body Parameter</span> &mdash; personalToUpdate </div>

    </div>  <!-- field-items -->




    <h3 class="field-label">Return type</h3>
    <div class="return-type">
      <a href="#Personal">Personal</a>
      
    </div>

    <!--Todo: process Response Object and its headers, schema, examples -->

    <h3 class="field-label">Example data</h3>
    <div class="example-data-content-type">Content-Type: </div>
    <pre class="example"><code></code></pre>

    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#Personal">Personal</a>
    <h4 class="field-label">201</h4>
    Created
        <a href="#"></a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
    <h4 class="field-label">404</h4>
    Not Found
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <h1><a name="ResponsableController">ResponsableController</a></h1>
  <div class="method"><a name="deleteResponsableUsingDELETE"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="delete"><code class="huge"><span class="http-method">delete</span> /responsabledealmacen/{id}</code></pre></div>
    <div class="method-summary">deleteResponsable (<span class="nickname">deleteResponsableUsingDELETE</span>)</div>
    <div class="method-notes"></div>

    <h3 class="field-label">Path parameters</h3>
    <div class="field-items">
      <div class="param">id (required)</div>

      <div class="param-desc"><span class="param-type">Path Parameter</span> &mdash; id </div>
    </div>  <!-- field-items -->







    <!--Todo: process Response Object and its headers, schema, examples -->


    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#"></a>
    <h4 class="field-label">204</h4>
    No Content
        <a href="#"></a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <div class="method"><a name="getResponsableUsingGET"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="get"><code class="huge"><span class="http-method">get</span> /responsabledealmacen/{id}</code></pre></div>
    <div class="method-summary">Gets the product with specific id (<span class="nickname">getResponsableUsingGET</span>)</div>
    <div class="method-notes"></div>

    <h3 class="field-label">Path parameters</h3>
    <div class="field-items">
      <div class="param">id (required)</div>

      <div class="param-desc"><span class="param-type">Path Parameter</span> &mdash; id </div>
    </div>  <!-- field-items -->






    <h3 class="field-label">Return type</h3>
    <div class="return-type">
      <a href="#Responsable">Responsable</a>
      
    </div>

    <!--Todo: process Response Object and its headers, schema, examples -->

    <h3 class="field-label">Example data</h3>
    <div class="example-data-content-type">Content-Type: </div>
    <pre class="example"><code></code></pre>

    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#Responsable">Responsable</a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
    <h4 class="field-label">404</h4>
    Not Found
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <div class="method"><a name="saveResponUsingPOST"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="post"><code class="huge"><span class="http-method">post</span> /responsabledealmacen</code></pre></div>
    <div class="method-summary">saveRespon (<span class="nickname">saveResponUsingPOST</span>)</div>
    <div class="method-notes"></div>


    <h3 class="field-label">Consumes</h3>
    This API call consumes the following media types via the <span class="header">Content-Type</span> request header:
    <ul>
      <li><code>application/json</code></li>
    </ul>

    <h3 class="field-label">Request body</h3>
    <div class="field-items">
      <div class="param">responToSave <a href="#Responsable">Responsable</a> (required)</div>

      <div class="param-desc"><span class="param-type">Body Parameter</span> &mdash; responToSave </div>

    </div>  <!-- field-items -->




    <h3 class="field-label">Return type</h3>
    <div class="return-type">
      <a href="#Responsable">Responsable</a>
      
    </div>

    <!--Todo: process Response Object and its headers, schema, examples -->

    <h3 class="field-label">Example data</h3>
    <div class="example-data-content-type">Content-Type: </div>
    <pre class="example"><code></code></pre>

    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#Responsable">Responsable</a>
    <h4 class="field-label">201</h4>
    Created
        <a href="#"></a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
    <h4 class="field-label">404</h4>
    Not Found
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <div class="method"><a name="updateResponsableUsingPUT"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="put"><code class="huge"><span class="http-method">put</span> /responsabledealmacen/{id}</code></pre></div>
    <div class="method-summary">updateResponsable (<span class="nickname">updateResponsableUsingPUT</span>)</div>
    <div class="method-notes"></div>

    <h3 class="field-label">Path parameters</h3>
    <div class="field-items">
      <div class="param">id (required)</div>

      <div class="param-desc"><span class="param-type">Path Parameter</span> &mdash; id </div>
    </div>  <!-- field-items -->

    <h3 class="field-label">Consumes</h3>
    This API call consumes the following media types via the <span class="header">Content-Type</span> request header:
    <ul>
      <li><code>application/json</code></li>
    </ul>

    <h3 class="field-label">Request body</h3>
    <div class="field-items">
      <div class="param">responsableToUpdate <a href="#Responsable">Responsable</a> (required)</div>

      <div class="param-desc"><span class="param-type">Body Parameter</span> &mdash; responsableToUpdate </div>

    </div>  <!-- field-items -->




    <h3 class="field-label">Return type</h3>
    <div class="return-type">
      <a href="#Responsable">Responsable</a>
      
    </div>

    <!--Todo: process Response Object and its headers, schema, examples -->

    <h3 class="field-label">Example data</h3>
    <div class="example-data-content-type">Content-Type: </div>
    <pre class="example"><code></code></pre>

    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#Responsable">Responsable</a>
    <h4 class="field-label">201</h4>
    Created
        <a href="#"></a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
    <h4 class="field-label">404</h4>
    Not Found
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <h1><a name="ResponsableInvenController">ResponsableInvenController</a></h1>
  <div class="method"><a name="deleteResponsableInvenUsingDELETE"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="delete"><code class="huge"><span class="http-method">delete</span> /responsabledeinven/{id}</code></pre></div>
    <div class="method-summary">deleteResponsableInven (<span class="nickname">deleteResponsableInvenUsingDELETE</span>)</div>
    <div class="method-notes"></div>

    <h3 class="field-label">Path parameters</h3>
    <div class="field-items">
      <div class="param">id (required)</div>

      <div class="param-desc"><span class="param-type">Path Parameter</span> &mdash; id </div>
    </div>  <!-- field-items -->







    <!--Todo: process Response Object and its headers, schema, examples -->


    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#"></a>
    <h4 class="field-label">204</h4>
    No Content
        <a href="#"></a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <div class="method"><a name="getResponsableUsingGET1"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="get"><code class="huge"><span class="http-method">get</span> /responsabledeinven/{id}</code></pre></div>
    <div class="method-summary">Gets the product with specific id (<span class="nickname">getResponsableUsingGET1</span>)</div>
    <div class="method-notes"></div>

    <h3 class="field-label">Path parameters</h3>
    <div class="field-items">
      <div class="param">id (required)</div>

      <div class="param-desc"><span class="param-type">Path Parameter</span> &mdash; id </div>
    </div>  <!-- field-items -->






    <h3 class="field-label">Return type</h3>
    <div class="return-type">
      <a href="#ResponsableInven">ResponsableInven</a>
      
    </div>

    <!--Todo: process Response Object and its headers, schema, examples -->

    <h3 class="field-label">Example data</h3>
    <div class="example-data-content-type">Content-Type: </div>
    <pre class="example"><code></code></pre>

    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#ResponsableInven">ResponsableInven</a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
    <h4 class="field-label">404</h4>
    Not Found
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <div class="method"><a name="saveResponUsingPOST1"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="post"><code class="huge"><span class="http-method">post</span> /responsabledeinven</code></pre></div>
    <div class="method-summary">saveRespon (<span class="nickname">saveResponUsingPOST1</span>)</div>
    <div class="method-notes"></div>


    <h3 class="field-label">Consumes</h3>
    This API call consumes the following media types via the <span class="header">Content-Type</span> request header:
    <ul>
      <li><code>application/json</code></li>
    </ul>

    <h3 class="field-label">Request body</h3>
    <div class="field-items">
      <div class="param">responToSave <a href="#ResponsableInven">ResponsableInven</a> (required)</div>

      <div class="param-desc"><span class="param-type">Body Parameter</span> &mdash; responToSave </div>

    </div>  <!-- field-items -->




    <h3 class="field-label">Return type</h3>
    <div class="return-type">
      <a href="#ResponsableInven">ResponsableInven</a>
      
    </div>

    <!--Todo: process Response Object and its headers, schema, examples -->

    <h3 class="field-label">Example data</h3>
    <div class="example-data-content-type">Content-Type: </div>
    <pre class="example"><code></code></pre>

    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#ResponsableInven">ResponsableInven</a>
    <h4 class="field-label">201</h4>
    Created
        <a href="#"></a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
    <h4 class="field-label">404</h4>
    Not Found
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <div class="method"><a name="updateResponsableUsingPUT1"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="put"><code class="huge"><span class="http-method">put</span> /responsabledeinven/{id}</code></pre></div>
    <div class="method-summary">updateResponsable (<span class="nickname">updateResponsableUsingPUT1</span>)</div>
    <div class="method-notes"></div>

    <h3 class="field-label">Path parameters</h3>
    <div class="field-items">
      <div class="param">id (required)</div>

      <div class="param-desc"><span class="param-type">Path Parameter</span> &mdash; id </div>
    </div>  <!-- field-items -->

    <h3 class="field-label">Consumes</h3>
    This API call consumes the following media types via the <span class="header">Content-Type</span> request header:
    <ul>
      <li><code>application/json</code></li>
    </ul>

    <h3 class="field-label">Request body</h3>
    <div class="field-items">
      <div class="param">responsableToUpdate <a href="#ResponsableInven">ResponsableInven</a> (required)</div>

      <div class="param-desc"><span class="param-type">Body Parameter</span> &mdash; responsableToUpdate </div>

    </div>  <!-- field-items -->




    <h3 class="field-label">Return type</h3>
    <div class="return-type">
      <a href="#ResponsableInven">ResponsableInven</a>
      
    </div>

    <!--Todo: process Response Object and its headers, schema, examples -->

    <h3 class="field-label">Example data</h3>
    <div class="example-data-content-type">Content-Type: </div>
    <pre class="example"><code></code></pre>

    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#ResponsableInven">ResponsableInven</a>
    <h4 class="field-label">201</h4>
    Created
        <a href="#"></a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
    <h4 class="field-label">404</h4>
    Not Found
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <h1><a name="TecnicoController">TecnicoController</a></h1>
  <div class="method"><a name="deleteTecnicoUsingDELETE"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="delete"><code class="huge"><span class="http-method">delete</span> /tecnico/{id}</code></pre></div>
    <div class="method-summary">deleteTecnico (<span class="nickname">deleteTecnicoUsingDELETE</span>)</div>
    <div class="method-notes"></div>

    <h3 class="field-label">Path parameters</h3>
    <div class="field-items">
      <div class="param">id (required)</div>

      <div class="param-desc"><span class="param-type">Path Parameter</span> &mdash; id </div>
    </div>  <!-- field-items -->







    <!--Todo: process Response Object and its headers, schema, examples -->


    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#"></a>
    <h4 class="field-label">204</h4>
    No Content
        <a href="#"></a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <div class="method"><a name="getTecnicoUsingGET"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="get"><code class="huge"><span class="http-method">get</span> /tecnico/{id}</code></pre></div>
    <div class="method-summary">Gets the product with specific id (<span class="nickname">getTecnicoUsingGET</span>)</div>
    <div class="method-notes"></div>

    <h3 class="field-label">Path parameters</h3>
    <div class="field-items">
      <div class="param">id (required)</div>

      <div class="param-desc"><span class="param-type">Path Parameter</span> &mdash; id </div>
    </div>  <!-- field-items -->






    <h3 class="field-label">Return type</h3>
    <div class="return-type">
      <a href="#Tecnico">Tecnico</a>
      
    </div>

    <!--Todo: process Response Object and its headers, schema, examples -->

    <h3 class="field-label">Example data</h3>
    <div class="example-data-content-type">Content-Type: </div>
    <pre class="example"><code></code></pre>

    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#Tecnico">Tecnico</a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
    <h4 class="field-label">404</h4>
    Not Found
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <div class="method"><a name="saveTecnicoUsingPOST"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="post"><code class="huge"><span class="http-method">post</span> /tecnico</code></pre></div>
    <div class="method-summary">saveTecnico (<span class="nickname">saveTecnicoUsingPOST</span>)</div>
    <div class="method-notes"></div>


    <h3 class="field-label">Consumes</h3>
    This API call consumes the following media types via the <span class="header">Content-Type</span> request header:
    <ul>
      <li><code>application/json</code></li>
    </ul>

    <h3 class="field-label">Request body</h3>
    <div class="field-items">
      <div class="param">tecToSave <a href="#Tecnico">Tecnico</a> (required)</div>

      <div class="param-desc"><span class="param-type">Body Parameter</span> &mdash; tecToSave </div>

    </div>  <!-- field-items -->




    <h3 class="field-label">Return type</h3>
    <div class="return-type">
      <a href="#Tecnico">Tecnico</a>
      
    </div>

    <!--Todo: process Response Object and its headers, schema, examples -->

    <h3 class="field-label">Example data</h3>
    <div class="example-data-content-type">Content-Type: </div>
    <pre class="example"><code></code></pre>

    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#Tecnico">Tecnico</a>
    <h4 class="field-label">201</h4>
    Created
        <a href="#"></a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
    <h4 class="field-label">404</h4>
    Not Found
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>
  <div class="method"><a name="updateTecnicoUsingPUT"/>
    <div class="method-path">
    <a class="up" href="#__Methods">Up</a>
    <pre class="put"><code class="huge"><span class="http-method">put</span> /tecnico/{id}</code></pre></div>
    <div class="method-summary">updateTecnico (<span class="nickname">updateTecnicoUsingPUT</span>)</div>
    <div class="method-notes"></div>

    <h3 class="field-label">Path parameters</h3>
    <div class="field-items">
      <div class="param">id (required)</div>

      <div class="param-desc"><span class="param-type">Path Parameter</span> &mdash; id </div>
    </div>  <!-- field-items -->

    <h3 class="field-label">Consumes</h3>
    This API call consumes the following media types via the <span class="header">Content-Type</span> request header:
    <ul>
      <li><code>application/json</code></li>
    </ul>

    <h3 class="field-label">Request body</h3>
    <div class="field-items">
      <div class="param">tecnicoToUpdate <a href="#Tecnico">Tecnico</a> (required)</div>

      <div class="param-desc"><span class="param-type">Body Parameter</span> &mdash; tecnicoToUpdate </div>

    </div>  <!-- field-items -->




    <h3 class="field-label">Return type</h3>
    <div class="return-type">
      <a href="#Tecnico">Tecnico</a>
      
    </div>

    <!--Todo: process Response Object and its headers, schema, examples -->

    <h3 class="field-label">Example data</h3>
    <div class="example-data-content-type">Content-Type: </div>
    <pre class="example"><code></code></pre>

    <h3 class="field-label">Produces</h3>
    This API call produces the following media types according to the <span class="header">Accept</span> request header;
    the media type will be conveyed by the <span class="header">Content-Type</span> response header.
    <ul>
      <li><code>*/*</code></li>
    </ul>

    <h3 class="field-label">Responses</h3>
    <h4 class="field-label">200</h4>
    OK
        <a href="#Tecnico">Tecnico</a>
    <h4 class="field-label">201</h4>
    Created
        <a href="#"></a>
    <h4 class="field-label">401</h4>
    Unauthorized
        <a href="#"></a>
    <h4 class="field-label">403</h4>
    Forbidden
        <a href="#"></a>
    <h4 class="field-label">404</h4>
    Not Found
        <a href="#"></a>
  </div> <!-- method -->
  <hr/>

  <h2><a name="__Models">Models</a></h2>
  [ Jump to <a href="#__Methods">Methods</a> ]

  <h3>Table of Contents</h3>
  <ol>
    <li><a href="#Inventario"><code>Inventario</code> - Inventario</a></li>
    <li><a href="#Personal"><code>Personal</code> - Personal</a></li>
    <li><a href="#Responsable"><code>Responsable</code> - Responsable</a></li>
    <li><a href="#ResponsableInven"><code>ResponsableInven</code> - ResponsableInven</a></li>
    <li><a href="#Tecnico"><code>Tecnico</code> - Tecnico</a></li>
  </ol>

  <div class="model">
    <h3><a name="Inventario"><code>Inventario</code> - Inventario</a> <a class="up" href="#__Models">Up</a></h3>
    <div class='model-description'></div>
    <div class="field-items">
      <div class="param">cantidad (optional)</div><div class="param-desc"><span class="param-type"><a href="#integer">Integer</a></span>  format: int32</div>
<div class="param">material (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
<div class="param">ndeserie (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
    </div>  <!-- field-items -->
  </div>
  <div class="model">
    <h3><a name="Personal"><code>Personal</code> - Personal</a> <a class="up" href="#__Models">Up</a></h3>
    <div class='model-description'></div>
    <div class="field-items">
      <div class="param">apellido (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
<div class="param">contraseña (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
<div class="param">id (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
<div class="param">nombre (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
    </div>  <!-- field-items -->
  </div>
  <div class="model">
    <h3><a name="Responsable"><code>Responsable</code> - Responsable</a> <a class="up" href="#__Models">Up</a></h3>
    <div class='model-description'></div>
    <div class="field-items">
      <div class="param">apellido (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
<div class="param">contraseña (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
<div class="param">id (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
<div class="param">nombre (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
    </div>  <!-- field-items -->
  </div>
  <div class="model">
    <h3><a name="ResponsableInven"><code>ResponsableInven</code> - ResponsableInven</a> <a class="up" href="#__Models">Up</a></h3>
    <div class='model-description'></div>
    <div class="field-items">
      <div class="param">apellido (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
<div class="param">contraseña (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
<div class="param">id (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
<div class="param">nombre (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
    </div>  <!-- field-items -->
  </div>
  <div class="model">
    <h3><a name="Tecnico"><code>Tecnico</code> - Tecnico</a> <a class="up" href="#__Models">Up</a></h3>
    <div class='model-description'></div>
    <div class="field-items">
      <div class="param">apellido (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
<div class="param">contraseña (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
<div class="param">id (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
<div class="param">nombre (optional)</div><div class="param-desc"><span class="param-type"><a href="#string">String</a></span>  </div>
    </div>  <!-- field-items -->
  </div>
  </body>
</html>
