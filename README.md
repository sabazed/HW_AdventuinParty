<p>We are already in the middle of the run-up to Christmas, and at this time the penguins of the PGdP are also preparing for Christmas. We therefore call such a penguin Adventuin.</p>
<h5 id="adventuin">Adventuin</h5>
<p>An Adventuin has a name (a string), a height in centimeters (integer number), a color (for this there is a class <code>RgbColor</code> already created in the project), a (Christmas) hat and the language that it usually uses to speak. For hat and language we still need separate classes, we will use enums for them:</p>
<ol>
<li><div class="pe-task-0 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-tcx-c178=""><div _ngcontent-tcx-c178="" class="guided-tour success">
    <fa-icon _ngcontent-tcx-c178="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-tcx-c178="" class="task-name ng-star-inserted">Implement enum HatType</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>
<p>Create an Enum HatType with the values <code>SANTA_CLAUS</code>, <code>REINDEER</code>, <code>FISHY_HAT</code> and <code>NO_HAT</code>;</p></li>
<li><div class="pe-task-1 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-tcx-c178=""><div _ngcontent-tcx-c178="" class="guided-tour success">
    <fa-icon _ngcontent-tcx-c178="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-tcx-c178="" class="task-name ng-star-inserted">Implement enum Language</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>
<p>Create an Enum Language with the values ENGLISH and GERMAN.
The class should have a method getLocalizedChristmasGreeting (String greeterName), which can be called on a Language value and returns a Christmas greeting in the respective language (as a string):</p>
<ul>
<li><code>For GERMAN</code>: <code>Fröhliche Weihnachten wünscht dir</code> and after a space the <code>greeterName</code> with a <code>!</code> at the very end.</li>
<li><code>For ENGLISH</code>: <code>greeterName</code> immediately followed by a space and <code>wishes you a Merry Christmas!</code></li>
<li>If you can speak more languages, you are welcome to add them (this is optional and will not be tested).</li></ul></li>
</ol>
<ul>
<li><div class="pe-task-2 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-tcx-c178=""><div _ngcontent-tcx-c178="" class="guided-tour success">
    <fa-icon _ngcontent-tcx-c178="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-tcx-c178="" class="task-name ng-star-inserted">Adventuin is present with all of its methods</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div></li>
</ul>
<p>Then we can create the class Adventuin which contains the attributes mentioned. Make the public getters getName, getHeight, getColor, getHatType and getLanguage available for this. You also need a public constructor that accepts the name, size, color, hat type and language in exactly this order. For your own testing it is advisable to overwrite toString (). A validity check (e.g. for zero) is not tested, but can be added.</p>
<p>The <code>test_Adventuin_createExample</code> test does the following: <br>
<code>new Adventuin ("AdvenTux", 123, new RgbColor (3, 2, 7, 0), HatType.FISHY_HAT, Language.ENGLISH);</code></p>
<h5 id="theparty">The Party</h5>
<p>Now that the basics are done, we want to invite the Adventuins to a party and perform some interesting operations on them.
All methods of this subtask are created in the class AdventuinParty and should be static. Furthermore, every method receives a <code>java.util.List</code> with <code>Adventuin</code>s as parameters, which contains all participating adventuins. This list is always free of duplicates and free of <code>null</code>. They also don't return <code>null</code> in the methods, either directly or in any collections/maps.</p>
<ul>
<li><div class="pe-task-3 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-tcx-c178=""><div _ngcontent-tcx-c178="" class="guided-tour success">
    <fa-icon _ngcontent-tcx-c178="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-tcx-c178="" class="task-name ng-star-inserted">Group participants by hats</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>
<p>Implement the <code>groupByHatType</code> method. Return a <code>Map&lt;HatType, List &lt;Adventuin&gt;&gt;</code> in which the submitted participants are grouped by hats. The map should only contain the hat types that at least one participant has. (This is also the case with the <code>Maps</code> in the following subtasks)</p></li>
<li><div class="pe-task-4 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-tcx-c178=""><div _ngcontent-tcx-c178="" class="guided-tour success">
    <fa-icon _ngcontent-tcx-c178="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-tcx-c178="" class="task-name ng-star-inserted">Christmas greetings</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>
<p>Implement the method <code>printLocalizedChristmasGreetings</code>. Nothing should be returned, but for all Adventuins in the list their personal Christmas greetings should be displayed on a line in the console. The string that the respective language object returns using <code>getLocalizedChristmasGreeting</code> with the name of the Adventuin as an argument should be used. The order should be determined by the height of the Adventuins, the smallest is allowed to say hello first, so sort the adventuins in ascending order according to their height. <br>
You can use <code>System.out.println(String)</code> to print text in the console.<br>
Example:</p></li>
</ul>
<pre><code class="hljs">Christian wishes you <span class="hljs-selector-tag">a</span> Merry Christmas!
</code></pre>
<ul>
<li><div class="pe-task-5 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-tcx-c178=""><div _ngcontent-tcx-c178="" class="guided-tour success">
    <fa-icon _ngcontent-tcx-c178="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-tcx-c178="" class="task-name ng-star-inserted">Adventuins with the longest names in their hat grouping</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>
<p>Implement the method <code>getAdventuinsWithLongestNamesByHatType</code>.
Return a map <code>&lt;HatType, List&lt;Adventuin&gt;&gt;</code> in which those participants are grouped by hats whose name length is equal to the maximum name length (number of characters) in the group of adventuins with the same hat type. Since several Adventuins can have names of the same length, that too has to be a <code>List</code>.</p></li>
<li><div class="pe-task-6 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-tcx-c178=""><div _ngcontent-tcx-c178="" class="guided-tour success">
    <fa-icon _ngcontent-tcx-c178="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-tcx-c178="" class="task-name ng-star-inserted">Average color brightness by size</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>
<p>Implement the method <code>getAverageColorBrightnessByHeight</code>.
Return a <code>Map&lt;Integer, Double&gt;</code> that contains the average brightness of the Adventuins' colors.
Grouping is done by size rounded in steps of 10 cm, that means for example from <code>95</code> to <code>104</code> all are grouped under integer <code>100</code>, and <code>105</code> to <code>114</code> under <code>110</code>, and so on. For the average brightness, the colors must be transformed to their brightness, for this we first convert them to 8-bit colors (value range 0 to 255) using the method <code>toRgbColor8Bit</code> and then we can use the formula <span><span class="katex"><span class="katex-mathml"><math><mrow><mo>(</mo><mn>0.2126</mn><mi mathvariant="normal">∗</mi><mi>R</mi><mo>+</mo><mn>0.7152</mn><mi mathvariant="normal">∗</mi><mi>G</mi><mo>+</mo><mn>0.0722</mn><mi mathvariant="normal">∗</mi><mi>B</mi><mo>)</mo><mi mathvariant="normal">/</mi><mn>255</mn></mrow>(0. 2126∗R+0.7152∗G+0.0722∗B)/255</math></span><span aria-hidden="true" class="katex-html"><span class="base"><span style="height: 1em; vertical-align: -0.25em;" class="strut"></span><span class="mopen">(</span><span class="mord">0</span><span class="mord">.</span><span class="mord">2</span><span class="mord">1</span><span class="mord">2</span><span class="mord">6</span><span class="mord">∗</span><span style="margin-right: 0.00773em;" class="mord mathdefault">R</span><span style="margin-right: 0.222222em;" class="mspace"></span><span class="mbin">+</span><span style="margin-right: 0.222222em;" class="mspace"></span></span><span class="base"><span style="height: 0.76666em; vertical-align: -0.08333em;" class="strut"></span><span class="mord">0</span><span class="mord">.</span><span class="mord">7</span><span class="mord">1</span><span class="mord">5</span><span class="mord">2</span><span class="mord">∗</span><span class="mord mathdefault">G</span><span style="margin-right: 0.222222em;" class="mspace"></span><span class="mbin">+</span><span style="margin-right: 0.222222em;" class="mspace"></span></span><span class="base"><span style="height: 1em; vertical-align: -0.25em;" class="strut"></span><span class="mord">0</span><span class="mord">.</span><span class="mord">0</span><span class="mord">7</span><span class="mord">2</span><span class="mord">2</span><span class="mord">∗</span><span style="margin-right: 0.05017em;" class="mord mathdefault">B</span><span class="mclose">)</span><span class="mord">/</span><span class="mord">2</span><span class="mord">5</span><span class="mord">5</span></span></span></span></span>. R, G and B are red, green and blue, the class RgbColor has suitable getters.</p></li>
</ul>
<p><em>(To experts: we just assume RgbColor is linear RGB and prefer to keep it simple).</em></p>
<ul>
<li><div class="pe-task-7 d-flex"><jhi-programming-exercise-instructions-task-status _nghost-tcx-c178=""><div _ngcontent-tcx-c178="" class="guided-tour success">
    <fa-icon _ngcontent-tcx-c178="" size="lg" class="ng-fa-icon test-icon text-success ng-star-inserted"><svg role="img" aria-hidden="true" focusable="false" data-prefix="far" data-icon="circle-check" class="svg-inline--fa fa-circle-check fa-lg" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M243.8 339.8C232.9 350.7 215.1 350.7 204.2 339.8L140.2 275.8C129.3 264.9 129.3 247.1 140.2 236.2C151.1 225.3 168.9 225.3 179.8 236.2L224 280.4L332.2 172.2C343.1 161.3 360.9 161.3 371.8 172.2C382.7 183.1 382.7 200.9 371.8 211.8L243.8 339.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"></path></svg></fa-icon><!---->
    <!---->
    <!---->
    <span _ngcontent-tcx-c178="" class="task-name ng-star-inserted">Adventuin circle dance</span><!---->
    
</div>
</jhi-programming-exercise-instructions-task-status></div>
<p>At the end of the party, our adventuins would like to perform a dance on an advent wreath in a large circle. It is particularly important to them that the size difference to the neighbors is as large as possible among adventuins with the same hat. To be able to measure that, the adventuins now want to calculate the absolute difference between the difference averages "greater than predecessor" and "smaller than predecessor" and thus obtain a measurement variable for the mixing of the variables in the dance circle.However, the Adventuins want to keep the freedom to dance next to each other in groups of the same size within the hat groups without worsening the statistics.
Implement the <code>getDiffOfAvgHeightDiffsToPredecessorByHatType</code> method. Return a <code>Map&lt;HatType, Double&gt;</code> that:</p></li>
<li><p>Grouped by HatType and then within each group …</p></li>
<li><p>Adventuin size differences to the respective predecessor (difference between successor and predecessor)</p></li>
<li><p>… grouped according to the sign of the difference result (sign: <code>-1</code>, <code>0</code> or <code>1</code>)</p></li>
<li><p>… with the value being absolute difference between</p></li>
<li><p>… the average of all negative height differences (or <code>0.0</code> if not available) and</p></li>
<li><p>… the average of all positive height differences (or <code>0.0</code> if not available).</p></li>
</ul>
<p>calculated. It should be noted that the adventuins actually stand in a circle, and the predecessor (with the same hat type, of course) of the first adventuin of a hat type group is the last adventuin in this group. If a penguin is alone with his hat type, he is his own predecessor, but this is not a problem for the calculation (this then falls into the difference category <code>0</code>), and the absolute difference of the difference averages is therefore also 0 in its group.</p>
<ul>
<li>For example, if we have two Adventuins with hat type SANTA_CLAUS, which have sizes 100 and 120, the first difference is 100-120 = -20, and the second difference 120-100 = 20; the absolute difference between them is 40.</li>
<li>If we have three Adventuins with hat type SANTA_CLAUS, which have the sizes 100 and 120 and 100, the first difference is 100-100 = 0, the second difference 120-100 = 20 and the third difference 100-120 = -20; the absolute difference between them is still 40. Here the case that two penguins of exactly the same size follow each other in the hat group, the statistics should not deteriorate.</li>
<li>But if we have four Adventuins with hat type SANTA_CLAUS, which have the sizes 100 and 120, 100 and 110, the first difference is 100-110 = -10, the second difference 120-100 = 20, the third difference 100-120 = - 20 and the fourth difference is 110-100 = 10. The averages are -15 for the negative and 15 for the positive differences, so the absolute difference is only 30.</li>
</ul></div>
</div><!---->
<!---->
</jhi-programming-exercise-instructions><!---->
            </div><!---->
            <!---->
            
  
