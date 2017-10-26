# Java files

{% for file in site.static_files %}
    {% if file.extname == '.java' %}
        * [file.path](file.path)
    {% endif %}
{% endfor %}