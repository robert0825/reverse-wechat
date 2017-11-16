package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class a
  extends com.tencent.mm.bm.a
{
  public String ID;
  
  public a()
  {
    GMTrace.i(14835219693568L, 110531);
    GMTrace.o(14835219693568L, 110531);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14835353911296L, 110532);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ID == null) {
        throw new b("Not all required fields were included: ID");
      }
      if (this.ID != null) {
        paramVarArgs.e(1, this.ID);
      }
      GMTrace.o(14835353911296L, 110532);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ID == null) {
        break label266;
      }
    }
    label266:
    for (paramInt = b.a.a.b.b.a.f(1, this.ID) + 0;; paramInt = 0)
    {
      GMTrace.o(14835353911296L, 110532);
      return paramInt;
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
        GMTrace.o(14835353911296L, 110532);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        a locala1 = (a)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(14835353911296L, 110532);
          return -1;
        }
        locala1.ID = locala.yqV.readString();
        GMTrace.o(14835353911296L, 110532);
        return 0;
      }
      GMTrace.o(14835353911296L, 110532);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */