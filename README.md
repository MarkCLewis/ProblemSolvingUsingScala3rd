# Introduction to Programming and Problem Solving Using Scala, 3rd Edition

This repository contains supplemental material for "Introduction to Programming and Problem Solving Using Scala, 3rd Edition".

## Setup

\begin{framed}
\subsection*{Scala on your Machine}

If you only use Scala on a machine in a computer lab, hopefully everything will have been set up for you so that you can simply type the name of a command and it will run. To run Scala on your own machine you can follow the instructions below.

\subsubsection*{Installation}

Scala requires Java\textregistered{} to run so if you do not have Java installed you should go to \url{http://java.oracle.com} and download then install the most recent version of the Java SE JDK. When you install Java, you can go with the default install locations.

After you have Java installed you can install Scala. To download Scala go to \url{http://www.scala-lang.org}. On that site download the latest version of Scala. The code in this book was written to work with Scala 2.12.

\subsubsection*{Dealing with the \texttt{PATH}}

If you are using Scala on your own machine, it is possible that entering \texttt{scala} or \texttt{scala.bat} on the command line could produce a message telling you that the command or program \texttt{scala} could not be found. This happens because the location of the installed programs are not in your default \texttt{PATH}.

The \texttt{PATH} is a set of directories that are checked whenever you run a command. The first match that is found for any executable file in a directory in the \texttt{PATH} will be run. If none of the programs in the \texttt{PATH} match what you entered, you get an error.

When you installed Scala, a lot of different stuff was put into the install directory. That included a subdirectory called ``\texttt{bin}'' with different files in it for the different executables. If you are on a Windows machine, odds are that you installed the program in \texttt{C:\textbackslash{}Program Files (x86)\textbackslash{}scala} so the \texttt{scala.bat} file that you want to run is in \texttt{C:\textbackslash{}Program Files\textbackslash{}scala\textbackslash{}bin\textbackslash{}scala.bat}. You can type in that full command or you can add the \texttt{bin} directory to your \texttt{PATH}. To do this go to Control Panel, System and Security, Advanced System Settings, Environment Variables, and edit the path to add \texttt{C:\textbackslash{}Program Files\textbackslash{}scala\textbackslash{}bin} to the path.

Under Unix/Linux you can do this from the command line. Odds are that Scala was installed in a directory called \texttt{scala} in your user space. To add the \texttt{bin} directory to your path you can do the following:
\begin{verbatim}
export PATH=$PATH:/home/username/scala/bin
\end{verbatim}
Replace ``\texttt{username}'' with your username. This syntax assumes you are using the bash shell. If it does not work for you, you can do a little searching on the web for how to add directories to your path in whatever shell you are running. To make it so that you do not have to do this every time you open a terminal, add that line to the appropriate configuration file in your home directory. If you are running the Bash shell on Linux this would be \texttt{.bashrc}.
\end{framed}

## Supplemental Text

