<% String webappUri = request.getContextPath();  %>
<div>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="<%=webappUri%>/main">Main</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%=webappUri%>/catalog">Catalog</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%=webappUri%>/cart">Cart</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%=webappUri%>/product">Product</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%=webappUri%>/order">Order</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="<%=webappUri%>/info">Info</a>
            </li>
        </ul>
    </nav>
</div>