## The Task
Create a Spring Boot API in Java.

1. Use Spring RestTemplate to get data from this JSON file: https://www.retriever-info.com/doccyexample/pulse.json
   It contains social media posts extracted from one of our microservices.

2. Filter the result to match hits with a story that contains a specified search word. Ex. magicthegathering .

3. Get the searchword as a parameter from the request.

4. Encapsolate the story in the hits with <b>searchstring</b>

5. Bonus task.
   Present the output as JSON objects. Input parameter is the "id" field of the parent/starting post of a tree structure.

Try using a recursive function to make the tree.

Populate it by using the relationship between "author.id" and "mentioned".

In practice - find where an author is mentioned and where its mentioned authors (968100087334227968) are in turn mentioned, and so on...
The post with id "75010_1626106476208230400_1048664 has an author that is mentioned more than once - you might be able to find starting posts that generate bigger trees.

Contact me if there is any questions.


## Notes
A very straightforward task when looking at steps 1, 2 and 3. 
However, both step 4 and 5 are confusing to read. 
I interpret step 4 as highlighting where the search matches in the story 
by adding bold html tags around the matching search word in the story.


