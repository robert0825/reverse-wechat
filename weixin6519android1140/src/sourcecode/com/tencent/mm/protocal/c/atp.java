package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class atp
  extends com.tencent.mm.bm.a
{
  public String uJh;
  
  public atp()
  {
    GMTrace.i(13340302639104L, 99393);
    GMTrace.o(13340302639104L, 99393);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13340436856832L, 99394);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uJh == null) {
        throw new b("Not all required fields were included: PhoneNum");
      }
      if (this.uJh != null) {
        paramVarArgs.e(1, this.uJh);
      }
      GMTrace.o(13340436856832L, 99394);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uJh == null) {
        break label266;
      }
    }
    label266:
    for (paramInt = b.a.a.b.b.a.f(1, this.uJh) + 0;; paramInt = 0)
    {
      GMTrace.o(13340436856832L, 99394);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.uJh == null) {
          throw new b("Not all required fields were included: PhoneNum");
        }
        GMTrace.o(13340436856832L, 99394);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        atp localatp = (atp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(13340436856832L, 99394);
          return -1;
        }
        localatp.uJh = locala.yqV.readString();
        GMTrace.o(13340436856832L, 99394);
        return 0;
      }
      GMTrace.o(13340436856832L, 99394);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\atp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */