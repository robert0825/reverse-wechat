package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class db
  extends com.tencent.mm.bm.a
{
  public com.tencent.mm.bm.b tRn;
  
  public db()
  {
    GMTrace.i(3690316431360L, 27495);
    GMTrace.o(3690316431360L, 27495);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3690450649088L, 27496);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRn == null) {
        throw new b.a.a.b("Not all required fields were included: Cookies");
      }
      if (this.tRn != null) {
        paramVarArgs.b(1, this.tRn);
      }
      GMTrace.o(3690450649088L, 27496);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tRn == null) {
        break label270;
      }
    }
    label270:
    for (paramInt = b.a.a.a.a(1, this.tRn) + 0;; paramInt = 0)
    {
      GMTrace.o(3690450649088L, 27496);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.tRn == null) {
          throw new b.a.a.b("Not all required fields were included: Cookies");
        }
        GMTrace.o(3690450649088L, 27496);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        db localdb = (db)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3690450649088L, 27496);
          return -1;
        }
        localdb.tRn = locala.csV();
        GMTrace.o(3690450649088L, 27496);
        return 0;
      }
      GMTrace.o(3690450649088L, 27496);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */