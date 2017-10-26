# Labs
* [Lab 4.1](lab4-1.md)

{% assign dir = '/src/chapter4/' %}
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