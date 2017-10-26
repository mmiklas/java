{% assign dir = '/src/chapter1' %}


# Java files


{% for file in site.static_files %}
<ul>
{% if ((file.path | slice: 0, 13 )==dir) and (file.extname == '.java') %}
<li>
< {{ dir }} - {{ file.path | slice: 0, 13 }} >
<div><a href="{{file.path}}">{{file.path}}</a></div>
</li>
{% endif %}
</ul>
{% endfor %}
