# WSVBBench

**Benchmarking Vulnerability Detection Tools for Web Services**

This project contains the source code of the services that serve as `workload` of a benchmark for tools able to detect SQL injection vulnerabilities in web services. The benchmark was introduced in [1], the papers explains the results and how they were obtained. The benchmark was later reused and extended in [2].

The ground truth of this workload is presented in the
[detailed results](data/wsvd-bench-results-webservices-sqlinjection.xlsx) file.
In practice, the column `Review` represents what is considered as the `true vulnerabilities (TV)`.

1. Nuno Antunes and Marco Vieira, *["Benchmarking Vulnerability Detection Tools for Web Services"](http://ieeexplore.ieee.org/document/5552783/)*, IEEE 8th International Conference on Web Services (ICWS 2010), Miami, Florida, USA: IEEE Computer Society, ISBN: 978-1-4244-8146-0, July 5-10, 2010, [DOI:10.1109/ICWS.2010.76](https://doi.org/10.1109/ICWS.2010.76).  
2. Nuno Antunes and Marco Vieira, *["Assessing and Comparing Vulnerability Detection Tools for Web Services: Benchmarking Approach and Examples"](http://ieeexplore.ieee.org/document/6763052/)*, IEEE Transactions on Services Computing, vol. 8, no. 2, pp. 269–283, 2015, [DOI:10.1109/TSC.2014.2310221](https://doi.org/10.1109/TSC.2014.2310221).



##  How to use it

1. Setup your database. A script to fill a `PostgreSQL` database can be found in database dump](data). It is a minimal version, just for demo.
2. Configure the class `Database.java` according to the database and configuration used in step 1.
3. You can (must) replace the class `Logging.java` for your favorite logging framework.
4. Install the missing `maven` dependencies, located inside [install](install). Use the [install.sh](install/install.sh) to help you.
5. Build the `.war` package, using `mvn package` or `mvn install`
6. Deploy the services in your app server.
7. Run your vulnerability detection tool against the sources or services, and compare the results with the ground truth.


##  Sources Characterization


The benchmark consists of 21 services, adapted from three standard benchmarks
developed by the [Transactions processing Performance Council](http://www.tpc.org), namely: TPC-App, TPC-C, and TPC-W.
Both `vulnerable`   and `non-vulnerable` versions of the services are included.
These services include a total of 80 operations (# operations) with 158 known
SQL Injection vulnerabilities (# vulnerabilities).
The table below presents, for each service, the number of known vulnerabilities,
the number of lines of code per operation (LoC/Op), and the Average Cyclomatic Complexity of the code
(calculated using [SourceMonitor](http://www.campwoodsw.com/sourcemonitor.html)).
As we can see, the services are quite diverse in terms of complexity, size and
even in number of vulnerabilities. This diversity is important to evaluate tools
that have different effectiveness in different scenarios..


|Source Benchmark| Service Name | # operations  | # vulnerabilities  | LoC/Op | Avg. C. Complexity |
|:-------:|:-------------------:|------:|--------:|-------:|-------:|
| TPC-App |    ProductDetail    |     2 |       0 |    242 |      5 |
|         |     NewProducts     |     2 |       1 |    206 |    4.5 |
|         |     NewCustomer     |     6 |      35 |   1230 |    5.6 |
|         | ChangePaymentMethod |     2 |       2 |    198 |      5 |
|                                                                   |
|  TPC-C  |       Delivery      |     9 |      10 |   2043 |     21 |
|         |       NewOrder      |     7 |      15 |   2317 |     33 |
|         |     OrderStatus     |     7 |      18 |   1463 |     13 |
|         |       Payment       |    13 |      34 |   4251 |     25 |
|         |      StockLevel     |     4 |       6 |    320 |      4 |
|                                                                   |
|  TPC-W  |     AdminUpdate     |     2 |       2 |    162 |      5 |
|         |  CreateNewCustomer  |     6 |      27 |    978 |      3 |
|         |  CreateShoppingCart |     2 |       0 |    414 |   2.67 |
|         |    DoAuthorSearch   |     2 |       1 |     88 |      3 |
|         |   DoSubjectSearch   |     2 |       1 |     90 |      3 |
|         |    DoTitleSearch    |     2 |       1 |     90 |      3 |
|         |    GetBestSellers   |     2 |       1 |    124 |      3 |
|         |     GetCustomer     |     2 |       1 |     92 |      4 |
|         |  GetMostRecentOrder |     2 |       1 |    258 |      6 |
|         |    GetNewProducts   |     2 |       1 |    100 |      3 |
|         |     GetPassword     |     2 |       1 |     80 |      2 |
|         |     GetUsername     |     2 |       0 |     80 |      2 |
|                                                                   |
|======
|         |      __Total__      |    80 |     158 |  14826 |  __-__ |
{: rules="groups"}


##  Works using the benchmark

5. J. Thomé, L. K. Shar, D. Bianculli, L. Briand, *[“Security Slicing for Auditing Common Injection Vulnerabilities”](http://hdl.handle.net/10993/29924)*, Journal of Systems and Software, 2017.
4. J. Thomé, L. K. Shar, D. Bianculli, L. Briand, *["Search-driven String Constraint Solving for Vulnerability Detection"](http://hdl.handle.net/10993/29045)*, In Proceedings of the 39th International Conference on Software Engineering (ICSE 2017). ACM.
3. A. P. Matsunaga, R. Moraes, N. Antunes, *["Coverage Metrics and Detection of Injection Vulnerabilities: An Experimental Study"](https://doi.org/10.1109/EDCC.2016.32)*, 12th European Dependable Computing Conference (EDCC 2016), Gothenburg, Sweden, September 5-9, 2016.
2. M. A. Laverdière, B. J. Berger, E. Merloz, *["Taint analysis of manual service compositions using Cross-Application Call Graphs"](https://doi.org/10.1109/SANER.2015.7081882)*, 2015 IEEE 22nd International Conference on Software Analysis, Evolution, and Reengineering (SANER), Montreal, QC, 2015, pp. 585-589.
1. A. Neto, *["Security Benchmarking of Transactional Systems"](http://hdl.handle.net/10183/143292)*, PhD thesis, University of Coimbra, 2012, Coimbra, Portugal.
{: reversed="reversed"}
