{% assign dir = '/src/chapter1' %}

# Java files

{% for file in site.static_files %}
<ul>
{% assign dir2 = file.path | slice: 0, 13 %}
{% if dir2 == dir and file.extname == '.java' %}
<li>

{% assign dir2 = file.path | slice: 0, 13 %}
{% if dir2 == dir and file.extname == '.java' %}
< {{ dir }} - {{ dir2 }} >
{% endif %}

<div><a href="{{file.path}}">{{file.path}}</a></div>
</li>
{% endif %}
</ul>
{% endfor %}
