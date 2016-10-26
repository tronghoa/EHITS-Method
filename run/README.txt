
(CC-by-nc-sa-2.5) Algorithmic Engineering group, Universita' "La Sapienza"
    With the support of the DELIS - EU FET research project
    See the license.txt file for licensing details.

    Version 2.0 - June 4th, 2007
    Update 1.3 - February 20th, 2007.
    Update 1.2 - January 18th, 2007
    Update 1.1 - August 31th, 2006
    Version 1.0 - August 10th, 2006

This collection is the result of the effort of a team of volunteers,
see acknowledgments.txt

========================================================================
webspam-uk2006-set?-labels.txt - The labels themselves.

The labels are contained in plain text files (webspam-uk2006-set?-labels.txt)
with one line per host. On each line, there are four fields separated
by spaces:

 - Field #1: host name.
 - Field #2: judgments.
 - Field #3: "spamicity" measure.
 - Field #4: label for the host.

The judgments are a comma-separated list of "judge:judgment" pairs.
Human judges are identified by 'jNN', in which NN are identifiers
assigned to the judges in an arbitrary order. The credits at the
beginning of this file mention only the names of the judges that
classified 200 hosts or more.

We also added two special judges: 'odp' and 'domain'.  The judge
'odp' labels as normal all the UK hosts that were mentioned in
the Open Directory Project (http://www.dmoz.org/) on May 2006.
Please note that according to ODP guidelines, a web site may get
included in ODP even if it contains spamming aspects. The criteria
for inclusion in ODP is having high quality, which is not the
opposite of being spam.

The judge 'domain' labels as normal all the UK hosts ending in
.ac.uk, .sch.uk, .gov.uk, .mod.uk, .nhs.uk or .police.uk.

The spamicity measure is calculated by assigning 1 point for each
'spam' (S) judgment, 0.5 points for each 'borderline' (B)
judgment, and 0 points for each 'normal' (N) judgment, and taking
the average.  The 'can not judge' (?) marks are ignored for this
calculation.

The label for a host with an average of over 0.5 is spam, for a
host with an average of less than 0.5 is normal, and for a host
with exactly 0.5 is undecided.

========================================================================
webspam-uk2006-set?-labels-DomainOrTwoHumans.txt

The labels as used in the paper from which some of the features in the
Web Spam Challenge were obtained (see http://webspam.lip6.fr/).

In this case, the odp: labels are not taken into account, and we consider
only hosts within a trusted domain, or having at least two human evaluations.
The undecided hosts are ignored.  The format of this file is 'hostname,label'.

========================================================================

More information is available at http://www.yr-bcn.es/webspam/
including the guidelines given to the human judges, the instructions
for obtaining the links and contents of the pages in this collection,
and the contact information for questions and comments.

========================================================================

Version 2.0: on June 4th, 2007, we included the labels obtained during
the Web Spam Challenge Track I. "set1" was the set of training labels 
for the challenge, and "set2" was the set of test labels.

Update 1.3: on Feburary 20th, 2007, we included a note in this README
file specifying that being in ODP does not necessarily mean spam-free.

Update 1.2: on January 18th, 2007, we added the labels as used in the 
paper from which some of the features for the Track I of the Web Spam
Challenge (webspam.lip6.fr) were obtained.

Update 1.1: as of August 31th, 2006, we are releasing a new version of the
collection, to fix an error in the ODP labels (Open Directory Project).

In the 1.0 version we had wrongly used ODP data from May 2005 instead of
May 2006. This error is now corrected and all the odp: labels now correspond
to the correct date; we apologize for the inconvenience.

--
Carlos Castillo
June 2007
