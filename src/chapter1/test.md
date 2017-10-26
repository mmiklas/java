# Java files

{% for item in site.static_files %}
    {{ item.path }} - {{ item.extname }} 
{% endfor %}