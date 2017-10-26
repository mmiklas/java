# Java files

{% for file in site.static_files %}
    {% if file.extname == '.java' %}
        <a href="{{file.path}}">{{file.path}}</a>
    {% endif %}
{% endfor %}