
<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:b="http://bootsfaces.net/ui"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:p="http://primefaces.org/ui">
<h:head>
	<title>BootsFaces Basic Page</title>
</h:head>
<h:body>
<h:form>     
    <p:growl id="messages" showDetail="true" />
 
    <p:toolbar>
        <f:facet name="left">
            <p:commandButton type="button" value="New" icon="ui-icon-document" />
 
            <p:commandButton type="button" value="Open" icon="ui-icon-folder-open" />
 
            <span class="ui-separator">
                <span class="ui-icon ui-icon-grip-dotted-vertical" />
            </span>
 
            <p:commandButton type="button" title="Save" icon="ui-icon-disk" />
            <p:commandButton type="button" title="Delete" icon="ui-icon-trash" />
            <p:commandButton type="button" title="Print" icon="ui-icon-print" />
        </f:facet>
 
<!--         <f:facet name="right"> -->
<!--             <p:menuButton value="Options"> -->
<!--                 <p:menuitem value="Save" actionListener="#{toolbarView.save}" update="messages" icon="ui-icon-disk" /> -->
<!--                 <p:menuitem value="Update" actionListener="#{toolbarView.update}" update="messages" icon="ui-icon-arrowrefresh-1-w" /> -->
<!--                 <p:menuitem value="Delete" actionListener="#{toolbarView.delete}" ajax="false" icon="ui-icon-close" /> -->
<!--                 <p:menuitem value="Homepage" url="http://www.primefaces.org" icon="ui-icon-extlink" /> -->
<!--             </p:menuButton> -->
<!--         </f:facet> -->
 
    </p:toolbar>
</h:form>
</h:body>
</html>
