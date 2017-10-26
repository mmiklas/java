# Java files

{% for file in site.static_files %}
{% if file.extname == '.java' %}
<div><a href="{{file.path}}">{{file.path}}</a></div>
{% endif %}
{% endfor %}
