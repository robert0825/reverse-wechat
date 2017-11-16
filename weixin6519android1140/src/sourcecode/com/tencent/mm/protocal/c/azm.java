package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class azm
  extends ayx
{
  public String lSX;
  public String lSY;
  public int nFd;
  public String tQN;
  public int uNH;
  public int uNI;
  public int uNJ;
  public long uNK;
  
  public azm()
  {
    GMTrace.i(3687095205888L, 27471);
    GMTrace.o(3687095205888L, 27471);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3687229423616L, 27472);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tQN != null) {
        paramVarArgs.e(2, this.tQN);
      }
      paramVarArgs.fk(3, this.uNH);
      paramVarArgs.fk(4, this.nFd);
      paramVarArgs.fk(5, this.uNI);
      if (this.lSY != null) {
        paramVarArgs.e(6, this.lSY);
      }
      if (this.lSX != null) {
        paramVarArgs.e(7, this.lSX);
      }
      paramVarArgs.fk(8, this.uNJ);
      paramVarArgs.T(9, this.uNK);
      GMTrace.o(3687229423616L, 27472);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.tQN != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tQN);
      }
      i = i + b.a.a.a.fh(3, this.uNH) + b.a.a.a.fh(4, this.nFd) + b.a.a.a.fh(5, this.uNI);
      paramInt = i;
      if (this.lSY != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.lSY);
      }
      i = paramInt;
      if (this.lSX != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.lSX);
      }
      paramInt = b.a.a.a.fh(8, this.uNJ);
      int j = b.a.a.a.S(9, this.uNK);
      GMTrace.o(3687229423616L, 27472);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3687229423616L, 27472);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      azm localazm = (azm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3687229423616L, 27472);
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
          localazm.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3687229423616L, 27472);
        return 0;
      case 2: 
        localazm.tQN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3687229423616L, 27472);
        return 0;
      case 3: 
        localazm.uNH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3687229423616L, 27472);
        return 0;
      case 4: 
        localazm.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3687229423616L, 27472);
        return 0;
      case 5: 
        localazm.uNI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3687229423616L, 27472);
        return 0;
      case 6: 
        localazm.lSY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3687229423616L, 27472);
        return 0;
      case 7: 
        localazm.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3687229423616L, 27472);
        return 0;
      case 8: 
        localazm.uNJ = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3687229423616L, 27472);
        return 0;
      }
      localazm.uNK = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3687229423616L, 27472);
      return 0;
    }
    GMTrace.o(3687229423616L, 27472);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\azm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */