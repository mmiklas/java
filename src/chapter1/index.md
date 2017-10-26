{% assign dir = '/src/chapter1/' %}

# Labs
* [Lab 1.1](lab1-1.md)

# Java files

{% for file in site.static_files %}
<ul>
    {% assign dir2 = file.path | slice: 0, 14 %}
    {% if dir2 == dir and file.extname == '.java' %}
        <li>
            <div><a href="{{file.path}}">{{file.path | remove: dir}}</a></div>
        </li>
    {% endif %}
</ul>
{% endfor %}