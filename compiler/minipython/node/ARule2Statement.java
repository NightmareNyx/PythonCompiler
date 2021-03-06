/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class ARule2Statement extends PStatement
{
    private PIdentifier _id0_;
    private PIdentifier _id1_;
    private PStatement _statement_;

    public ARule2Statement()
    {
    }

    public ARule2Statement(
        PIdentifier _id0_,
        PIdentifier _id1_,
        PStatement _statement_)
    {
        setId0(_id0_);

        setId1(_id1_);

        setStatement(_statement_);

    }
    public Object clone()
    {
        return new ARule2Statement(
            (PIdentifier) cloneNode(_id0_),
            (PIdentifier) cloneNode(_id1_),
            (PStatement) cloneNode(_statement_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARule2Statement(this);
    }

    public PIdentifier getId0()
    {
        return _id0_;
    }

    public void setId0(PIdentifier node)
    {
        if(_id0_ != null)
        {
            _id0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _id0_ = node;
    }

    public PIdentifier getId1()
    {
        return _id1_;
    }

    public void setId1(PIdentifier node)
    {
        if(_id1_ != null)
        {
            _id1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _id1_ = node;
    }

    public PStatement getStatement()
    {
        return _statement_;
    }

    public void setStatement(PStatement node)
    {
        if(_statement_ != null)
        {
            _statement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _statement_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_id0_)
            + toString(_id1_)
            + toString(_statement_);
    }

    void removeChild(Node child)
    {
        if(_id0_ == child)
        {
            _id0_ = null;
            return;
        }

        if(_id1_ == child)
        {
            _id1_ = null;
            return;
        }

        if(_statement_ == child)
        {
            _statement_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_id0_ == oldChild)
        {
            setId0((PIdentifier) newChild);
            return;
        }

        if(_id1_ == oldChild)
        {
            setId1((PIdentifier) newChild);
            return;
        }

        if(_statement_ == oldChild)
        {
            setStatement((PStatement) newChild);
            return;
        }

    }
}
