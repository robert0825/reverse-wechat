package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class arw
  extends com.tencent.mm.bm.a
{
  public int tST;
  public arx uHQ;
  
  public arw()
  {
    GMTrace.i(13336812978176L, 99367);
    GMTrace.o(13336812978176L, 99367);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13336947195904L, 99368);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uHQ == null) {
        throw new b("Not all required fields were included: OplogRet");
      }
      paramVarArgs.fk(1, this.tST);
      if (this.uHQ != null)
      {
        paramVarArgs.fm(2, this.uHQ.aYq());
        this.uHQ.a(paramVarArgs);
      }
      GMTrace.o(13336947195904L, 99368);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tST) + 0;
      paramInt = i;
      if (this.uHQ != null) {
        paramInt = i + b.a.a.a.fj(2, this.uHQ.aYq());
      }
      GMTrace.o(13336947195904L, 99368);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uHQ == null) {
        throw new b("Not all required fields were included: OplogRet");
      }
      GMTrace.o(13336947195904L, 99368);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      arw localarw = (arw)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13336947195904L, 99368);
        return -1;
      case 1: 
        localarw.tST = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13336947195904L, 99368);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new arx();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((arx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localarw.uHQ = ((arx)localObject1);
        paramInt += 1;
      }
      GMTrace.o(13336947195904L, 99368);
      return 0;
    }
    GMTrace.o(13336947195904L, 99368);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\arw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */