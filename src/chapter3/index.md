# Labs
* [Lab 3.1](lab3-1.md)
* [Lab 3.2](lab3-2.md)
* [Lab 3.3](lab3-3.md)

{% assign dir = '/src/chapter3/' %}
# Java files
<ul>
    {% for file in site.static_files %}
    {% assign dir2 = file.path | slice: 0, 14 %}
    {% if dir2 == dir and file.extname == '.java' %}
    <li>
        <div><a href="{{file.path}}">{{file.path | remove: dir}}</a></div>
    </li>
    {% endif %}
    {% endfor %}
</ul>



