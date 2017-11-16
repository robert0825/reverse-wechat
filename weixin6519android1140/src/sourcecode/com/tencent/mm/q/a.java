package com.tencent.mm.q;

import com.tencent.gmtrace.GMTrace;

public final class a
  extends com.tencent.mm.plugin.fts.a.a
{
  public a()
  {
    GMTrace.i(17935380774912L, 133629);
    GMTrace.o(17935380774912L, 133629);
  }
  
  public final String getName()
  {
    GMTrace.i(17935514992640L, 133630);
    GMTrace.o(17935514992640L, 133630);
    return "FTS5FriendStorage";
  }
  
  public final int getPriority()
  {
    GMTrace.i(17935783428096L, 133632);
    GMTrace.o(17935783428096L, 133632);
    return 1280;
  }
  
  protected final String getTableName()
  {
    GMTrace.i(17936051863552L, 133634);
    GMTrace.o(17936051863552L, 133634);
    return "Friend";
  }
  
  public final int getType()
  {
    GMTrace.i(17935649210368L, 133631);
    GMTrace.o(17935649210368L, 133631);
    return 1280;
  }
  
  protected final void vr()
  {
    GMTrace.i(17935917645824L, 133633);
    GMTrace.o(17935917645824L, 133633);
  }
  
  protected final boolean vs()
  {
    GMTrace.i(17936186081280L, 133635);
    if (!ch(-107, 1))
    {
      GMTrace.o(17936186081280L, 133635);
      return true;
    }
    GMTrace.o(17936186081280L, 133635);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\q\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */