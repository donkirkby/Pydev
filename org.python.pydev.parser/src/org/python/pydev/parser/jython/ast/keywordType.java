// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;
import java.io.DataOutputStream;
import java.io.IOException;

public class keywordType extends SimpleNode {
    public NameTokType arg;
    public exprType value;

    public keywordType(NameTokType arg, exprType value) {
        this.arg = arg;
        this.value = value;
    }

    public keywordType(NameTokType arg, exprType value, SimpleNode parent) {
        this(arg, value);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("keyword[");
        sb.append("arg=");
        sb.append(dumpThis(this.arg));
        sb.append(", ");
        sb.append("value=");
        sb.append(dumpThis(this.value));
        sb.append("]");
        return sb.toString();
    }

    public void pickle(DataOutputStream ostream) throws IOException {
        pickleThis(55, ostream);
        pickleThis(this.arg, ostream);
        pickleThis(this.value, ostream);
    }

    public Object accept(VisitorIF visitor) throws Exception {
        traverse(visitor);
        return null;
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (arg != null)
            arg.accept(visitor);
        if (value != null)
            value.accept(visitor);
    }

}