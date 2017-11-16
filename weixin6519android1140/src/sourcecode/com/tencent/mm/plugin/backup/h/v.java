package com.tencent.mm.plugin.backup.h;

import com.tencent.gmtrace.GMTrace;

public final class v
  extends com.tencent.mm.bm.a
{
  public String ID;
  public com.tencent.mm.bm.b jgP;
  public int jhZ;
  public int jia;
  public int jib;
  public int jic;
  public int jid;
  
  public v()
  {
    GMTrace.i(14834414387200L, 110525);
    GMTrace.o(14834414387200L, 110525);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14834548604928L, 110526);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b.a.a.b("Not all required fields were included: ID");
      }
      paramVarArgs.fk(1, this.jhZ);
      if (this.ID != null) {
        paramVarArgs.e(2, this.ID);
      }
      if (this.jgP != null) {
        paramVarArgs.b(3, this.jgP);
      }
      paramVarArgs.fk(4, this.jia);
      paramVarArgs.fk(5, this.jib);
      paramVarArgs.fk(6, this.jic);
      paramVarArgs.fk(7, this.jid);
      GMTrace.o(14834548604928L, 110526);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.jhZ) + 0;
      paramInt = i;
      if (this.ID != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ID);
      }
      i = paramInt;
      if (this.jgP != null) {
        i = paramInt + b.a.a.a.a(3, this.jgP);
      }
      paramInt = b.a.a.a.fh(4, this.jia);
      int j = b.a.a.a.fh(5, this.jib);
      int k = b.a.a.a.fh(6, this.jic);
      int m = b.a.a.a.fh(7, this.jid);
      GMTrace.o(14834548604928L, 110526);
      return i + paramInt + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ID == null) {
        throw new b.a.a.b("Not all required fields were included: ID");
      }
      GMTrace.o(14834548604928L, 110526);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      v localv = (v)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(14834548604928L, 110526);
        return -1;
      case 1: 
        localv.jhZ = locala.yqV.nj();
        GMTrace.o(14834548604928L, 110526);
        return 0;
      case 2: 
        localv.ID = locala.yqV.readString();
        GMTrace.o(14834548604928L, 110526);
        return 0;
      case 3: 
        localv.jgP = locala.csV();
        GMTrace.o(14834548604928L, 110526);
        return 0;
      case 4: 
        localv.jia = locala.yqV.nj();
        GMTrace.o(14834548604928L, 110526);
        return 0;
      case 5: 
        localv.jib = locala.yqV.nj();
        GMTrace.o(14834548604928L, 110526);
        return 0;
      case 6: 
        localv.jic = locala.yqV.nj();
        GMTrace.o(14834548604928L, 110526);
        return 0;
      }
      localv.jid = locala.yqV.nj();
      GMTrace.o(14834548604928L, 110526);
      return 0;
    }
    GMTrace.o(14834548604928L, 110526);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */