package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class it
  extends com.tencent.mm.bm.a
{
  public com.tencent.mm.bm.b tXQ;
  public com.tencent.mm.bm.b tXR;
  public LinkedList<bch> tXS;
  
  public it()
  {
    GMTrace.i(3756083118080L, 27985);
    this.tXS = new LinkedList();
    GMTrace.o(3756083118080L, 27985);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3756217335808L, 27986);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tXQ == null) {
        throw new b.a.a.b("Not all required fields were included: Title");
      }
      if (this.tXR == null) {
        throw new b.a.a.b("Not all required fields were included: ServiceUrl");
      }
      if (this.tXQ != null) {
        paramVarArgs.b(1, this.tXQ);
      }
      if (this.tXR != null) {
        paramVarArgs.b(2, this.tXR);
      }
      paramVarArgs.d(3, 8, this.tXS);
      GMTrace.o(3756217335808L, 27986);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.tXQ != null) {
        paramInt = b.a.a.a.a(1, this.tXQ) + 0;
      }
      i = paramInt;
      if (this.tXR != null) {
        i = paramInt + b.a.a.a.a(2, this.tXR);
      }
      paramInt = b.a.a.a.c(3, 8, this.tXS);
      GMTrace.o(3756217335808L, 27986);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.tXS.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tXQ == null) {
        throw new b.a.a.b("Not all required fields were included: Title");
      }
      if (this.tXR == null) {
        throw new b.a.a.b("Not all required fields were included: ServiceUrl");
      }
      GMTrace.o(3756217335808L, 27986);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      it localit = (it)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3756217335808L, 27986);
        return -1;
      case 1: 
        localit.tXQ = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3756217335808L, 27986);
        return 0;
      case 2: 
        localit.tXR = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3756217335808L, 27986);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bch();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bch)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localit.tXS.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3756217335808L, 27986);
      return 0;
    }
    GMTrace.o(3756217335808L, 27986);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\it.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */