{% assign dir = '/src/chapter1' %}


# Java files


{% for file in site.static_files %}
<ul>
{% if file.extname == '.java' %}
<li>
<div>{{file.path | slice: 0, 13 }} <a href="{{file.path}}">{{file.path}}</a></div>
</li>
{% endif %}
</ul>
{% endfor %}
