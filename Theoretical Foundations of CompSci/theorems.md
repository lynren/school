---
geometry: margin=1.5cm, top=1cm, bottom=2cm
...
**Theorem 1.7.2**:

i. $\vdash\sim$*false* $\Leftrightarrow$ *true*  
   $\vdash\sim$*true* $\Leftrightarrow$ *false*
ii. $\vdash(\alpha\Leftrightarrow\beta)\Leftrightarrow(\beta\Leftrightarrow\alpha)$
iii. $\vdash(\alpha\Leftrightarrow\beta)\Leftrightarrow(\sim\alpha\Leftrightarrow\sim\beta)$
iv. $\vdash(\alpha\Leftrightarrow\beta)\land(\beta\Leftrightarrow\gamma)\Rightarrow(\alpha\Leftrightarrow\gamma)$
v. $\vdash(\alpha\Rightarrow(\beta\Rightarrow\gamma))\Leftrightarrow(\alpha\land\beta\Rightarrow\gamma)$

**Sub~=~** (*Substitutivity of =*)  
$\frac{s=t,\ \alpha(s)}{\alpha(t)}\ (\alpha(s)\ is\ free\ for\ t)$

Set Theory
==========
**Pinciple of Extension**: $A=B\ iff\ (\forall{x})( x\in{A}\Leftrightarrow x\in B)$ 

**I3~$\land$~**: $\alpha\land\beta,\ \alpha\Rightarrow\gamma\vdash\gamma\land\beta$  
**I3~$\lor$~**: $\alpha\lor\beta,\ \alpha\Rightarrow\gamma\vdash\gamma\lor\beta$  

**Lemma 3.2.1**: Let *A*, *B*, *C* be sets

i. $A=A$
ii. $if\ A=B,\ then\ B=A$
iii. $if\ A=B\ and\ B=C\,\ then\ A=C$

**Lemma 3.2.2**: $A\ne B\ iff\ (\exists x)(x\in A\land x\notin B)\lor(\exists x)(x\notin A\land x\in B)$

**Corollary 3.2.2.1**: Let *A* and *B* be sets  
$(\exists x)(x\in A\land x\notin B)\Rightarrow A\ne B$  

**SUBSET**: Let *A* and *B* be two sets  
$A\subseteq B\ iff\ (\forall{x})(x\in A\Rightarrow x\in B)$  

**PROPER SUBSET**:  
$A\subset B\ if\ A\subseteq B\ and\ A\neq B$  

**Lemma 3.2.3**: Let *A*, *B*, *C* be sets

i. $A\subseteq A$
ii. $if\ A\subseteq B\ and\ B\subseteq A,\ then\ A=B$
iii. $if\ A\subseteq B\ and\ B\subseteq C,\ then\ A\subseteq C$

**Lemma 3.2.4**: $if\ A=B,\ then\ (A\subseteq B)\land(B\subseteq A)$  
**Lemma 3.2.5**: $A\nsubseteq B \Leftrightarrow (\exists x)(x\in A\land x\notin B)$  
**Lemma 3.2.6**: $if\ A\subset B,\ then\ (\exists x)(x\in B\land x\notin A)$  

**FE7~$\in$~**: $\sim(\forall x\in X)S(x)\equiv (\exists x\in X)\sim S(x)$  
**FE8~$\in$~**: $\sim(\exists x \in X)S(x)\equiv (\forall x\in X)\sim S(x)$  

**Principle of Specification**: For every set *A* and every formula *S(x)*, there exists a set *B* whose elements are those of *A* for which *S(x)* is true.  
$$\{x\ |\ x\in A\land S(x)\}\ or\ \{x\in A\ |\ S(x)\}$$  

**Lemma 3.5.7**: $x\in \varnothing\Leftrightarrow false$  
**Lemma 3.5.8**: $A\neq\varnothing\Leftrightarrow(\exists x)x\in A$  
**Corollary 3.5.8.1**: $\sim(\exists x)x\in\varnothing$  
**Theorem 3.5.9**: $\varnothing\subseteq A,\ for\ any\ set\ A$  

**POWER SET**: Let *A* be a set. $\Rho(A)$ is the set $\{X|X\subseteq A\}$  
**UNION**: Let *A*, *B* be two sets. $A\cup B=\{x\ |\ x\in A\lor x\in B\}$  

**Theorem 4.1.1**: Let *A*, *B*, *C* be sets

i. $A\cup\varnothing =A$
ii. $A\cup A=A$
iii. $A\cup B=B\cup A$
iv. $(A\cup B)\cup C=A\cup(B\cup C)$
v. $A\subseteq B\ iff\ A\cup B=B$

**INTERSECTION**: $A\cap B=\{x\ |\ x\in A\land x\in B\}$  

**Theorem 4.2.2**: Let *A*, *B*, *C* be sets

i. $A\cap\varnothing =\varnothing$
ii. $A\cap A=A$
iii. $A\cap B=B\cap A$
iv. $(A\cap B)\cap C=A\cap(B\cap C)$
v. $A\subseteq B\ iff\ A\cap B=A$

**Corollary 4.2.2.1**: $A\cap B\subseteq A \subseteq A\cup B$  
**Theorem 4.2.3**: Let *A*, *B*, *C* bet any three sets

i. $A\cup(B\cap C)=(A\cup B)\cap(A\cup C)$
ii. $A\cap(B\cup C)=(A\cap B)\cup(A\cap C)$

**DISJOINT**: Two sets *A* and *B* are disjoint if $A\cap B=\varnothing$  
**RELATIVE COMPLEMENT**: RC of *B* in *A* is the set $A-B=\{x\ |\ x\in A\land x\notin B\}$  

**Theorem 4.3.4**: Let *A*, *B*, *C* be sets

i. $A\subseteq B\ iff\ A-B=\varnothing$
ii. $A-(A-B)=A\cap B$
iii. $A\cap(B-C)=(A\cap B)-(A\cap C)$

**Lemma 4.3.5**: Let $A\subseteq U.\ Then,\ x\in \overline{\rm A}\Leftrightarrow x\notin A$  
**Lemma 4.3.6**: DeMorgan's Theorem. Let *A*, *B* be any two subsets of U

i. $\overline{\rm A\cup B}=\overline{\rm A}\cap\overline{\rm B}$
ii. $\overline{\rm A\cap B}=\overline{\rm A}\cup\overline{\rm B}$

**Lemma 4.3.7**: Let *A*, *B* be any two subsets of U

i. $\overline{\rm\overline{\rm A}}=A$
ii. $\overline{\varnothing}=U\ and\ \overline{U}=\varnothing$
iii. $A\cap\overline{A}=\varnothing\ and\ A\cup\overline{A}=U$
iv. $A\subseteq B\ iff\ \overline{B}\subseteq\overline{A}$
v. $A-B=A\cap\overline{B}$

**ORDERED PAIR**: $(a,b)=\{\{a\},\{a,b\}\}=\{x\ |\ x=\{a\}\lor x=\{a,b\}\}$  
**Lemma 4.4.8**: $(a,b)=(x,y)\ implies\ that\ a=x\ and\ b=y$  
**Lemma 4.4.9**: $a=c\land b=d\Rightarrow (a,b)=(c,d)$  

**CARTESIAN PRODUCT**: $A\times B=\{x\ |\ (\exists a)(\exists b)(a\in A\land b\in B\land x=(a,b))\}=\{(a,b)\ |\ a\in A\land b\in B\}$  
**Lemma 4.5.10**: Let *A*, *B*, *X*, *Y* be sets

i. $(A\cup B)\times X=(A\times X)\cup (B\times X)$
ii. $(A\cap B)\times X=(A\times X)\cap (B\times X)$
iii. $(A-B)\times X=(A\times X)-(B\times X)$
iv. $(A\cap B)\times (X\cap Y)=(A\times X)\cap (B\times Y)$
v. $(A=\varnothing\lor b=\varnothing)\Leftrightarrow A\times B=\varnothing$

**COLLECTION (union of)**: Let *C* be a collection of sets.  
$\bigcup\limits_{X\in C} X=\{x\ |\ (\exists X)(X\in C\land x\in X)\}=\{x\ |\ x\in X\ for\ some\ X\in C\}$  
**INTERSECTION of C**: Let *C* be a collection of sets such that $C\neq\varnothing$  
$\bigcap\limits_{X\in C} X=\{x\ |\ (\forall X)(X\in C\Rightarrow x\in X)\}=\{x\ |\ x\in X\ for\ all\ X\in C\}$  

Relations
=========
**RELATION**: A set of ordered pairs. _R_ is a relation if $(\forall x)(x\in R\Rightarrow (\exists a)(\exists b)x=(a,b))$\newline
**DOMAIN**: domain of R is the set $DOM(R)=\{x\ |\ (\exists y)(x, y)\in R\}$\newline
**RANGE**: range of R is the set $RAN(R)=\{y\ |\ (\exists x)(x, y)\in R\}$\newline
**Relation from _X_ to _Y_**: $R\subseteq X\times Y$\newline
**Relation in _X_**: $R\subseteq X\times X$\newline
**Lemma 5.1.1**: Let $R\subseteq X\times Y$. Then $DOM(R)\subseteq X\ and\ RAN(R)\subseteq Y$

Properties of Relation
----------------------
Let _R_ be a relation in a set _X_:

  - _R_ is **_reflexive_** if $(\forall x\in X)(x, x)\in R$
  - _R_ is **_irreflexive_** if $(\forall x\in X)(x, x)\notin R$
  - _R_ is **_symmetric_** if $(x,y)\in R\Rightarrow (y,x)\in R$
  - _R_ is **_antisymmetric_** if $(x,y)\in R\land (y,x)\in R\Rightarrow x=y$
  - _R_ is **_asymmetric_** if $\forall x,y\in X, \sim((x,y)\in R\land (y,x)\notin R$, or equivalently, $\forall x,y\in X, (x,y)\in R\Rightarrow (y,x)\notin R$
  - _R_ is **_transitive_** if $(x,y)\in R\land (y,z)\in R\Rightarrow (x,z)\in R$

**Lemma 5.2.1**: Let _R_ be a relation in _X_. If $(\exists x\in X)(x,x)\in R$, then _R_ is not asymmetric\newline
**EQUIVALENCE RELATION**: A relation _R_ in a set _X_ is an ER if _R_ is reflexive, symmetric, and transitive\newline
**EQUIVALENCE CLASS OF x wrt R**: Let _R_ be an equivalence relation in a set _X_. For each $x\in X$, the **equiv class of x wrt R** is the set $[x]/R=\{y\ |\ y\in X\land (x,y)\in R\}=\{y\in X\ |\ (x,y)\in R\}$\newline
**COLLECTION OF EQUIV CLASSES wrt R**: $[X]/R=\{S\ |\ (\exists x)(x\in X\land S=[x]/R)\}=\{[x]/R\ |\ x\in X\}$\newline

**PARTITION**: Let _X_ be a set. A collection of sets C is a _**partition**_ of _X_ if

i. $\bigcup\limits_{S\in C} S=X$, and
ii. $\forall S\in C, S\neq \varnothing$, and
iii. $\forall S, S'\in C, S\neq S'\Rightarrow S\cap S'=\varnothing$

**CP 5.3a**: Let _R_ be a reflexive relation in _X_ and $a\in X$, then $(a,a)\in R$\newline
**CP 5.3b**: Let _R_ be a symmetric relation in _X_ and $(a,b)\in R$, then $(b,a)\in R$\newline
**CP 5.3c**: Let _R_ be a antisymmetric relation in _X_, and $(a,b)\in R\land (b,a)\in R$, then $a=b$\newline
**CP 5.3d**: Let _R_ be a transitive relation in _X_, and $(a,b)\in R\land (b,c)\in R$, then $(a,c)\in R$\newline

**Lemma 5.3.1**: If _R_ is an equivalence relation in X, then the collection of equivalence classes $[X]/R$ is a partition of X\newline
**INDUCED RELATION**: Let _C_ be a partition of _X_. The relation induced by _C_, denoted by $X/C$, is a relation in _X_, such that: $X/C=\{(x,y)\ |\ (\exists S\in C)(x\in S\land y\in S)\}$\newline
**Lemma 5.3.2**: Let _R_ be an equivalence relation in _X_. The relation induced by the collection of equivalence classes $[X]/R$ is identical to _R_, or, $X/([X]/R)=R$\newline
**Lemma 5.3.3**: Let _C_ be a partition of _X_. The induced relation $X/C$ is an equivalence relation in _X_.\newline
**Lemma 5.3.4**: Let _C_ be a partition of _X_. Then $A\in C\land a\in A\Rightarrow A=[a]/(X/C)$\newline
**Lemma 5.3.5**: Let _C_ be a partition of _X_. Then $[X]/(X/C)=C$\newline
**Theorem 5.3.6**:

i. If _R_ is an equivalence relation in _X_, then the set of equivalence classes $[X]/R$ is a partition of _X_ that induces the relation _R_, and
ii. If _C_ is a partition of _X_, then the induced relation $X/C$ is an equivalence relation in _X_ whose set of equivalence classes is identical to _C_\newline

**PARTIAL ORDER**: A relation _R_ in a set _X_ is a _partial order_ if R is reflexive, antisymmetric, and transitive\newline
**PARTIALLY ORDERED SET**: an ordered pair $(X,\precsim)$ in which _X_ in a set and $\precsim$ is a partial order in X. If $\forall x,y\in X, (x\precsim y)\lor (y\precsim x)$ then $\precsim$ is called a _**total order**_ and $(X,\precsim)$ is a _**totally ordered set**_ or a _**chain**_\newline
**STRICT ORDER**: a relation _R_ in a set _X_ is a _**strict order**_ if _R_ is asymmetric and transitive\newline

**Lemma 5.4.1**: let $\precsim$ be a partial order in _X_, and $X_=$ be the relation of equality in _X_. The relation $\precsim -X_=$ is a strict order in _X_\newline

**INVERSE RELATION**: Let $R$ be a relation in a set $X$. The _inverse_ of $R$ is the relation $R^{-1}=\{(y,x)\ |\ (x,y)\in R\}$

**COMPOSITION**: Let $R_1\subseteq A\times B$ and $R_2\subseteq B\times C$. The _composition_ of $R_1$ and $R_2$ is the relation $R_1\circ R_2=\{(x,z)\in A\times C\ |\ (\exists y\in B)((x,y)\in R_1\land (y,z)\in R_2)\}$

Functions
=========
**FUNCTION**: A function from sets $X$ to $Y$, denoted by $f:X\rightarrow Y$, is a relation from $X$ to $Y$ with:

i) $Dom(f)=X$
ii) $(x,y)\in f\land (x,z)\in f\Rightarrow y=z$


**MAP $x$ ONTO $y$**: Let $f: X\rightarrow Y$ and $(x,y)\in f$, or equivalently, $y=f(x)$. Then $f$ is said to map $x$ onto $y$, or $y$ is the _image_ of $x$ under $f$\newline

**Lemma 6.1.1**: Let $f: X\rightarrow Y$ and $g: X\rightarrow Y$. Then, $f=g$ iff $\forall x\in X, f(x)=g(x)$\newline

**IMAGE OF A SET UNDER $f$**: Let $f:X\rightarrow Y$ and $A\subseteq X$. The image of $A$ under $f$ is the set:
$$f(A)=\{y\in Y\ |\ (\exists x\in A)(x,y)\in f\}=\{y\in Y\ |\ (\exists x)(x\in A\land y=f(x))\} = \{f(x)\in Y\ |\ x\in A\}$$

**RESTRICTION/EXTENSION**: Let $f,g$ be two functions such that $g\subseteq f$. Then $g$ is a _restriction_ of $f$ and $f$ is an _extension_ of $f$. Let $f:X\rightarrow Y$ and $Z\subseteq X$ such that $Dom(g)=Z$. Then $g$ is _restriction_ of $f\rightarrow Z$ and $f$ is an _extension_ of $g$ to $X$. The function $g$ is denoted by $f|Z$, and $f|Z=\{(x,y)\in f\ |\ x\in Z\}$\newline

**$Y^X$**: The set of all function from $X\rightarrow Y$ is the set $Y^X=\{f\ |\ f:X\rightarrow Y\}$. Note $Y^X\subseteq P(X\times Y)$\newline

**ONTO**: A function $f:X\rightarrow Y$ is _onto_ or _surjective_, denoted by $f:X\xrightarrow{\text{onto}} Y$, iff $(\forall y\in Y)(\exists x\in X)(x,y)\in f$, or equivalently, $(\forall y\in Y)(\exists x\in X)y=f(x)$, or, $(\forall y)(y\in Y\Rightarrow ((\exists x)x\in X\land y=f(x)))$ \newline

**1-1**: A function $f:X\rightarrow Y$ is _one-to-one_ or _injective_, denoted by $f:X\xrightarrow{\text{1-1}} Y$, iff $(x,z)\in f\land (y,z)\in f\Rightarrow x=y$, or equivalently, $f(x)=f(y)\Rightarrow x=y$\newline

**1-1 CORRESPONDANCE**: A function $f:X\rightarrow Y$ is a _one-to-one correspondance_ or _bijective_, denoted by $f: X\xrightarrow[\text{onto}]{\text{1-1}} Y$, iff it is both 1-1 and onto\newline

**INVERSE**: Let $f:A\rightarrow B$. The _inverse_ of $f$ is the relation $f^{-1}$ from $B\rightarrow A$ such that $f^{-1}=\{(y,x)\ |\ (x,y)\in f\}$. $f^{-1}$ may not be a function\newline

**IMAGE OF A SET UNDER $R$**: Let $R\subseteq X\times Y$ be a relation from $X$ to $Y$ and $A\subseteq X$. The _image_ of $A$ under $R$ is the set $R(A)=\{y\in Y\  |\ (\exists x\in A)(x,y)\in R$\}$\newline

**INVERSE IMAGE**: Let $f:X\rightarrow Y$. Then $f^{-1}\subseteq Y\times X$ is a relation from $Y$ to $X$. Let $B\subseteq Y$. The _inverse image_ of $B$ under $f$ is the image of $B$ under $f^{-1}$ which is the set: $$f^{-1}(B)=\{x\in X\ |\ (\exists y\in B)(y,x)\in f^{-1}\}=\{x\in X\ |\ (\exists y\in B)(x,y)\in f\}=\{x\in X\ |\ f(x)\in B\}$$

**Lemma 6.3.1**: Let $f:A\rightarrow B$. Then $f^{-1}$ is a function from $B$ to $A$ iff $f$ is 1-1 and onto\newline

**Theorem 6.3.2**: $f:A\xrightarrow[\text{onto}]{\text{1-1}} B$ iff $f^{-1}:B\xrightarrow[\text{onto}]{\text{1-1}} A$\newline

**COMPOSITION**: Let $f:A\rightarrow B$ and $g:B\rightarrow C$. The _composition_ of $f$ and $g$ is the function $f\circ g:A\rightarrow C$\newline

**Lemma 6.3.3**: Let $f:A\xrightarrow{\text{1-1}} B$ and $g:B\xrightarrow{\text{1-1}} C$. Then $f\circ g:A\xrightarrow{\text{1-1}} C$\newline

**Lemma 6.3.4**: Let $f:A\xrightarrow{\text{onto}} B$ and $g:B\xrightarrow{\text{onto}} C$. Then $f\circ g:A\xrightarrow{\text{onto}} C$\newline

**Theorem 6.3.5**: Let $f:A\xrightarrow[\text{onto}]{\text{1-1}} B$ and $g:B\xrightarrow[\text{onto}]{\text{1-1}} C$. Then $f\circ g:A\xrightarrow[\text{onto}]{\text{1-1}} C$

**CHARACTERISTIC FUNCTION**: Let $U$ be the universal set, and $A\subseteq U$. The _characteristic function_ of $A$ is the function $\chi_A:U\rightarrow \{0,1\}$ such that $\chi_A(x)=0$ if $x\notin A$ or $1$ if $x\in A$

Finite and Infinite Sets
========================

**EQUINUMEROUS**: two sets are equinumerous, denoted by $X\sim Y$, if there exists a function $F:X\xrightarrow[\text{onto}]{\text{1-1}} Y$. Informally, two sets are equinumerous if they have the same number of elements\newline

**Theorem 7.1.1**: Let $C$ be a collection of sets. The relation $\sim$ is an equivalence relation in C\newline

**INITIAL SEGMENT**: Let $N$ be the set of all positive integers and $k\in N$. The _initial segment_ of $k$ is the set $N_k=\{x\in N\ |\ x\leq k\}$\newline

**FINITE/INFINITE**: A set $A$ is a _finite_ set if $A=\varnothing$ or $(\exists k\in N)N_k\sim A$. A set is _inifinite_ if it is not finite. The _size_ of $A$, denote by $|A|$, is 0 if $A=\varnothing$ and is $k$ if $N_k\sim A$ for some $k\in N$\newline

**Theorem 7.2.2**: Let $A, B$ be two finite sets. $|A|=|B|$ iff $A\sim B$\newline
**Lemma 7.2.3**: Let $A$ and $B$ be two non-empty such that $A\cap B=\varnothing$. Then $|A\cup B|=|A|+|B|$\newline
**Theorem 7.2.4**: Let $A$ and $B$ be two non-empty finite sets. $|A\cup B|=|A|+|B|-|A\cap B|$\newline
**Theorem 7.2.5**: Let $A$ and $B$ be two non-empty finite sets. If $|A| > k\cdot |B|$, where $k\in N$, then $(\forall f)f:A\rightarrow B, (\exists b\in B)|f^{-1}(\{b\})|\geq k+1$\newline

**Pigeonhole Principle**: To put $m$ pigeons into $n$ pigeonholes such that $m>n$, there will be one pidgeonhole containing at least $\lceil \frac{m}{n}\rceil$ pigeons\newline

**Theorem 7.3.6**: A set $A$ is an infinite set iff there exists $Y$ such that $Y\subset A$ and $A\sim Y$\newline

**COUNTABLE**: Let $N$ be the set of all positive integers. A set $X$ is _denumerable_ or _countably infinite_ if $N\sim X$. A set is _countable_ if it is finite or denumerable and is _uncountable_ otherwise\newline

**Lemma 7.4.7**: Let $A$ be a denumerable set. Any infinite subset of $A$ is denumerable\newline

**Family**: A _family_ is a function $y:I\rightarrow Y$ whose domain $I$ is called an _index set_. Every element in $I$ is called an _index_ and the range of $y$ is called an _indexed set_. A _family of sets_ is a family whose indexed set is a collection of sets.\newline

Graph Theory
============
**GRAPH**: a triple $G=(V,E,\psi)$ where 

- $V$ and $E$ are two disjoint ($V\cap E=\varnothing$) finite sets such that $V\neq\varnothing$
    - each element in $V$ is called a _vertex_ of $G$. $V$ is the _vertex set_ of $G$
    - each element in $E$ is called an _edge_ of $G$. $E$ is the _edge set_ of $G$
- $\psi$ (_incidence function_ of $G$) is a function such that
    - $\psi:E\rightarrow \{\{u,v\}\ |\ u,v\in V\}$ (if $G$ is an undirected graph)
    - $\psi:E\rightarrow V\times V$ (if $G$ is a directed graph)

**ORDER**: _order_ of $G$ is the number of vertices in $G$ (i.e. $|V|$)\newline
**SIZE of G**: _size_ of $G$ is the number of edges in $G$ (i.e. $|E|$)\newline

**END-VERTICES**: if $\psi(e)=\{a,b\}$, then $a$ and $b$ are _end-vertices_ of $e$\newline
**HEAD & TAIL**: if $\psi(e)=(a,b)$, then $a$ is the _tail_ of $e$ and $b$ is the _head_ of $e$\newline
**INCIDENT, ADJACENT**: from the previous two definitions, we say edge $e$ _joins_ vertices $a$ and $b$. Edge $e$ is _incident upon_ vertices $a$ and $b$. Vertex $a$ is _adjacent_ to vertex $b$, and vertex $b$ is _adjacent_ to vertex $a$\newline

**SELF-LOOP**: an edge whos two end-vertices are identical (i.e. $\psi(e)=\{u,u\}$)\newline
**PARALLEL EDGES**: two edges are _parallel edges_ if they have the same end-vertices. In a directed graph, they must also have the same tail and head\newline
**SIMPLE GRAPH**: a graph having no self-loops and no parallel edges\newline
**NULL GRAPH**: a graph without any edges\newline
**TRIVIAL GRAPH**: a graph with exactly 1 vertex\newline
**LOOP GRAPH**: a graph consisting of 1 vertex and 1 self-loop\newline

**DEGREE**: the number of edges incident upon a vertex $v$ in $G$, with self-loops counted twice, is the _degree_ of $v$ in $G$, denoted by $deg_G(v)$. Formally,
$$deg_G(v)=|\{e\in E\ |\ v\in\psi(e)\land\psi(e)\neq\{v,v\}\}|+2|\{e\in E\ |\ \psi(e)=\{v,v\}\}|$$
**DEGREE SEQUENCE**: degree sequence of $G=(V,E,\psi)$ is the sequnce $deg(v_1),deg(v_2),...,deg(v_p)$ such that $deg(v_i)\geq deg(v_{i+1}), 1\leq i<p$ (i.e. degree sequence of vertices of $G$ is listed in decreasing order)\newline
**GRAPHICAL SEQUENCE**: a decreasing sequence of integers that is a degree sequence of a simple undirected graph\newline
**REGULAR GRAPH**: a graph in which all the vertices are of the same degree\newline
**k-REGULAR GRAPH**: a regular graph in which every vertex is of degree $k$\newline
**CUBIC GRAPH**: a 3-regular graph\newline
**ISOLATED VERTEX & PENDANT**: a vertex $v$ where $deg(v)=0$ is _isolated_. $v$ is a _pendant_ if $deg(v)=1$\newline

**THEOREM 8.4.1**: Let $G=(V,E,\psi)$ be an undirected graph. Then, $\sum_{v\in V}deg(v)=2|E|$\newline

**THEOREM 8.4.2**: The number of vertices of odd degree in an undirected graph is even\newline

**Corollary 8.4.3**: Let $G=(V,E)$ be a simple undirected graph. Then, $|E|\leq \frac{|V|(|V|-1)}{2}$\newline

**IDENTICAL GRAPH**: Let $G=(V,E,\psi)$ and $G=(V',E',\psi ')$ ne two graphs. $G$ is identical to $G'$, denoted by $G=G'$ if $V=V'$, $E=E'$, and $\psi =\psi '$.\newline

**SUBGRAPH & SUPERGRAPH**: $G'$ is a _subgraph_ of $G$ and $G$ is a _supergraph_ of $G'$, denoted by $G'\sqsubseteq G$ if $V'\subseteq V$, $E'\subseteq E$, and $\psi '\subseteq \psi$\newline

**PROPER SUBGRAPH**: $G'$ is a _proper subgraph_ of $G$, denoted by $G'\sqsubset G$, if $G'\sqsubseteq G$ and $G\neq G'$\newline

**SPANNING SUBGRAPH**: $G'$ is a _spanning subgraph_ of $G$ if $V=V'$ and $G'$ is a subgraph of $G$\newline

**UNDERLYING SIMPLE GRAPH**: of $G$, is a simple graph resulting from $G$ after all the self-loops are removed, and for every pair of adjacent vertices having parallel edges joining them, all but one of the edges joining them are removed.\newline

**LEMMA 8.5.4**: The relation $\sqsubseteq$ is a partial order\newline
**LEMMA 8.5.5**: The relation $\sqsubset$ is a strict order\newline

**INDUCED SUBGRAPH**: Let $G=(V,E,\psi)$ be a graph. Let $U\subseteq V$ such that $U\neq \varnothing$. The _subgraph of_ $G$ _induced by_ $U$, denoted by $\langle U\rangle_G$, is the largest subgraph of $G$ with vertex set $U$. i.e. $\langle U\rangle_G\in\zeta_U\land(\forall H\in\zeta_U)(H\sqsubseteq \langle U\rangle_G)$, where $\zeta_U$ is the set of all subgraphs of $G$ with vertex set $U$\newline

**COMPLETE GRAPH**: a _complete_ graph is a simple undirected graph $G=(V,E)$ in which $\{u,v\}\in E$, $\forall u,v\in V$, $u\neq v$\newline

**COMPLEMENT GRAPH**: Let $G=(V,E)$ be a simple graph. The _complement_ of $G$ is the simple graph $\overline{\rm G}=(V,\overline{\rm E})$, such that $\forall u,v\in V$, $(u\neq v)\Rightarrow (\{u,v\}\notin E\Leftrightarrow \{u,v\}\in\overline{\rm E})$\newline

**GRAPH UNION**: Let $G=(V,E,\psi)$ and $G'=(V',E',\psi ')$ be two simple graphs such that $\psi\cup\psi '$ is a function. The _union_ of $G$ and $G'$ is the graph $G\cup G'=(V\cup V',E\cup E',\psi\cup\psi ')$\newline

**LEMMA 8.6.6**: Let $G=(V,E)$ be a simple graph and $\overline{\rm G}=(V,\overline{\rm E})$ be the complement of $G$

i. $E\cap\overline{\rm E}=\varnothing$
ii. $G\cup\overline{\rm G}=K_{|V|}$, where $K_{|V|}=(V,E_{K_{|V|}})$ is the complete graph with vertex set $V$

**BIPARTITE GRAPH**: a graph $G=(V,E,\phi)$ is a _bipartite graph_ if there exists $\{X,Y\}$ such that $X\cup Y=V$ and $X\cap Y=\varnothing$, and every edge in the graph has one end-vertex in $X$ and one end-vertex in $Y$.\newline

Isomorphism
-----------
**ISOMORPHIC**: let $G_1=(V_1,E_1,\psi_1)$ and $G_2=(V_2,E_2,\psi_2)$. $G_1$ and $G_2$ are _isomorphic_, denoted by $G_1\cong G_2$, if $\exists\Phi :V_1\rightarrow V_2$ such that $\{a,b\}\in E_1$ iff $\{\Phi(a),\Phi(b)\}\in E_2$. $\Phi$ is called an _isomorphic function_ from $G_1$ to $G_2$\newline

**LEMMA 9.1.1**: the relation $\cong$ is an equivalence relation in the set of all graphs\newline

**THEOREM 9.1.2**: let $G_1=(V_1,E_1)$ and $G_2=(V_2, E_2)$ be two simple graphs such that $G_1\cong G_2$. Then, $|V_1|=|V_2|$ and $|E_1|=|E_2|$\newline

**THEOREM 9.1.3**: let $G_1=(V_1,E_1)$ and $G_2=(V_2,E_2)$ be two sumple graphs such that $G_1\cong G_2$. Then, $deg(u)=deg(\Phi(u)),\forall u\in V_1$, where $\Phi$ is an isomorphic function from $G_1$ to $G_2$\newline

**THEOREM 9.1.4**: Let $G_1=(V_1,E_1)$ and $G_2=(V_2,E_2)$ be two simple undirected graphs. Then, $G_1\cong G_2$ iff $\overline{\rm G_1}\cong\overline{\rm G_2}$\newline

Connected Graphs
----------------
**u-v WALK**: alternating sequence of vertices and edges of $G$, $w_0,e_1,w_1,...,w_{k-1},e_k,w_k$, s.t. $w_0=u$ and $w_k=v$ and $psi(e_i)=\{w_{i-1}, w_i\}, 1\leq i\leq k$\newline
**internal vertex**: $w_i,1\leq i\leq k-1$\newline
**terminating vertices**: $w_0=u$ and $w_k=v$ of a $u-v$ walk\newline
**CLOSED WALK**: a $u-v$ walk where $u=v$\newline
**NULL WALK**: $u-v$ walk where $k=0$\newline

**u-v TRAIL**: a $u-v$ walk with no repeated edges\newline
**u-v PATH**: a $u-v$ walk with no repeated vertices\newline
**CIRCUIT**: non-null $u-v$ trail where $u=v$\newline
**CYCLE**: circuit with no repeated vertices except the first and last\newline

**LEMMA 10.1.1**: Every $u-v$ walk contains a $u-v$ path\newline
**LEMMA 10.1.2**: Every circuit contains a cycle\newline

**CONNECTED**: two vertices $u$ and $v$ in a graph $G$ are connected, denoted by $u\sim_G v$, if there exists a $u-v$ path in $G$.\newline
**CONNECTED GRAPH**: a graph is connected if every two vertices in it are connected. $(\forall u,v\in V)u\sim_G v$\newline
**DISCONNECTED GRAPH**: a graph that is not connected $(\exists u,v\in V)u\nsim_G v$\newline

**THEOREM 10.2.3**: binary relation $\sim$ is an equivalence relation in $V_G$\newline

**CONNECTED COMPONENT**: of $G$ is a subgraph of $G$ induced by an equivalence class wrt $\sim$. # of components in $G$ is denoted by $\omega(G)$\newline

**LEMMA 10.2.4**: $\omega(G)\geq 1$, for every graph $G=(V,E)$\newline
**LEMMA 10.2.5**: let $G_i=(V_i,E_i),1\leq i\leq\omega$, be the connected components of $G=(V,E)$. Then, $\bigcup\limits_{i=1}^\omega V_i=V$ and $\bigcup\limits_{i=1}^\omega E_i=E$\newline
**LEMMA 10.2.6**: let $H$ and $H'$ be two distinct connected components of $G=(V,E)$. Then, $V_H\cap V_{H'}=\varnothing$ and $E_H\cap E_{H'}=\varnothing$\newline
**LEMMA 10.2.7**: let $H$ and $H'$ be two distinct connected components of $G=(V,E)$. Then, $(\forall u\in V_H)(\forall v\in V_{H'})u\nsim v$\newline
**THEOREM 10.2.8**: A graph $G=(V,E)$ is disconnected iff $\omega(G)\geq 2$\newline
**LEMMA 10.2.9**: let $G_i=(V_i,E_i),1\leq i\leq\omega$ be the connected components of $G=(V,E)$ s.t. the order and size of $G_i$ are $p_i$ and $q_i$, respectively. Then, $\sum\limits_{i=1}^\omega p_i=|V|$ and $\sum\limits_{i=1}^\omega q_i=|E|$\newline

**Length of a path**: number of edges in the path\newline
**Distance**: between two vertices $u$ and $v$ in graph $G$, $dist_G(u,v)$, is the length of the shortest $u-v$ path\newline
**Diameter**: of a graph, denoted by $diameter(G)$, is the longest distance in that graph, i.e. $diameter(G)=max\{dist_G(u,v)\ |\ u,v\in V_G\}$\newline
**Girth**: of $G$ is the length of the shortest cycle in $G$\newline

**CYCLE GRAPH**: a graph of order $n$ consisting of _exactly one cycle_. A cycle of $order=3$ is called a _triangle_\newline
**PATH GRAPH**: a graph of order $n$ consisting of _exactly one path_

Bridges and Cut Vertices
------------------------
**G-e**: let $G$ be a graph and $v$ and $e$ be a vertex and edge of $G$, respectively. Then, $G-e$ is the graph resulting from $G$ after e is removed. $G-v$ is the graph resulting from $G$ after $v$ is removed\newline

**BRIDGE**: an edge $e$ is a _bridge_ in $G$ if $\omega(G-e) > \omega(G)$\newline

**CUT-VERTEX**: a vertex $v$ in a non-trivial graph $G$ is a _cut-vertex_ if $\omega(G-v) > \omega(G)$\newline

**LEMMA 11.1.1**: let $G$ be a connected graph. If $e$ is a _bridge_ in $G$, then $G-e$ is a disconnected graph. If $e$ is a _cut-vertex_ in $G$, then $G-v$ is a disconnected graph.\newline

**THEOREM 11.1.1**: let $G=(V,E,\psi$ be a connected graph. An $e$ of $G$ is a bridge iff $e$ does not lie on any cycle in $G$\newline

**Corollary 11.1.1.1**: let $G=(V,E,\psi)$ be a graph and $\psi(e)=\{a,b\}$ be an edge in $G$. Then $e$ is a bridge in $G$ iff the path $a\ e\ b$ is the only path connecting vertices $a$ and $b$\newline

**THEOREM 11.1.2**: let $G=(V,E,\psi)$ be a non-trivial connected graph. A vertex $v$ of $G$ is a _cut-vertex_ iff there exists two other vertices $x,y$ in $G$ s.t. every $x-y$ path in $G$ passes through $v$\newline

**THEOREM 11.1.3**: let $G=(V,E,\psi)$ be a connected graph with $|V|\geq 3$. If $e$ is a bridge in $G$, then $e$ is incident upon a cut-vertex $G$\newline

Trees
-----
**TREE**: a connected, undirected, simple graph without any circuits\newline

**FOREST**: a graph whose connected components are trees\newline

**Lemma 12.1.1**: A tree is a simple graph

**Theorem 12.1.2**: Let G=(V,E) be an undirected graph. The following six statements are equivalent:

- $G$ is a tree
- $G$ is circuit-free, but if any new edge is added to $G$, a circuit is formed
- $G$ contains no self-loops and for every two vertices in $G$, there is a unique path connecting them
- $G$ is connected but if any edge is removed from $G$, then the resulting graph is disconnected
- $G$ is connected and $|E|=|V|-1$
- $G$ is circuit-free and $|E|=|V|-1$

**Theorem 12.1.3**: In any tree $G$ of order $p\geq 2$, there are at least two _pendants_\newline

**SPANNING TREE**: of a connected graph $G$ is a spanning subgraph of $G$ which is a tree. Specifically, a graph $T=(V_T,E_T)$ is a _spanning tree_ of a connected graph $G=(V,E)$ if $T\sqsubseteq G$ and $V_T=V$\newline

**Theorem 12.2.4**: A graph is connected _iff_ it has a spanning tree
