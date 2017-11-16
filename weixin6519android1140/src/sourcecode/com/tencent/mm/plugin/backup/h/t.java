package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class t
  extends com.tencent.mm.bm.a
{
  public String ID;
  public int jhV;
  
  public t()
  {
    GMTrace.i(14834145951744L, 110523);
    GMTrace.o(14834145951744L, 110523);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14834280169472L, 110524);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      if (this.ID != null) {
        paramVarArgs.e(1, this.ID);
      }
      paramVarArgs.fk(2, this.jhV);
      GMTrace.o(14834280169472L, 110524);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ID == null) {
        break label318;
      }
    }
    label318:
    for (paramInt = b.a.a.b.b.a.f(1, this.ID) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.jhV);
      GMTrace.o(14834280169472L, 110524);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.ID == null) {
          throw new b("Not all required fields were included: ID");
        }
        GMTrace.o(14834280169472L, 110524);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        t localt = (t)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14834280169472L, 110524);
          return -1;
        case 1: 
          localt.ID = locala.yqV.readString();
          GMTrace.o(14834280169472L, 110524);
          return 0;
        }
        localt.jhV = locala.yqV.nj();
        GMTrace.o(14834280169472L, 110524);
        return 0;
      }
      GMTrace.o(14834280169472L, 110524);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\h\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */