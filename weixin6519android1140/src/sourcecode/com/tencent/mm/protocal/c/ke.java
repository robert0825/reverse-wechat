package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class ke
  extends ayx
{
  public String jWU;
  public int mFu;
  public b uaS;
  public b uaT;
  public int uaU;
  
  public ke()
  {
    GMTrace.i(16872107933696L, 125707);
    GMTrace.o(16872107933696L, 125707);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16872242151424L, 125708);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.mFu);
      if (this.uaS != null) {
        paramVarArgs.b(3, this.uaS);
      }
      if (this.uaT != null) {
        paramVarArgs.b(4, this.uaT);
      }
      if (this.jWU != null) {
        paramVarArgs.e(5, this.jWU);
      }
      paramVarArgs.fk(6, this.uaU);
      GMTrace.o(16872242151424L, 125708);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.mFu);
      paramInt = i;
      if (this.uaS != null) {
        paramInt = i + b.a.a.a.a(3, this.uaS);
      }
      i = paramInt;
      if (this.uaT != null) {
        i = paramInt + b.a.a.a.a(4, this.uaT);
      }
      paramInt = i;
      if (this.jWU != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.jWU);
      }
      i = b.a.a.a.fh(6, this.uaU);
      GMTrace.o(16872242151424L, 125708);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(16872242151424L, 125708);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ke localke = (ke)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(16872242151424L, 125708);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localke.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16872242151424L, 125708);
        return 0;
      case 2: 
        localke.mFu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(16872242151424L, 125708);
        return 0;
      case 3: 
        localke.uaS = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(16872242151424L, 125708);
        return 0;
      case 4: 
        localke.uaT = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(16872242151424L, 125708);
        return 0;
      case 5: 
        localke.jWU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16872242151424L, 125708);
        return 0;
      }
      localke.uaU = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(16872242151424L, 125708);
      return 0;
    }
    GMTrace.o(16872242151424L, 125708);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */