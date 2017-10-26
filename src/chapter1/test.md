---
layout: page
---

# Java files

{% for file in site.static_files %}
    {% if file.extname == '.java' %}    
        <p class="view"><a href="{{file.path}}">{{file.path}}</a></p>        
    {% endif %}
{% endfor %}

# askdjlaskdj

{% for post in site.pages %}
    <a href="{{ post.url | absolute_url }}">
      {{ post.title }}
    </a>
{% endfor %}