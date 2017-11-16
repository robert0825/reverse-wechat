package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ig
  extends ayx
{
  public int ePH;
  public String omE;
  public String omF;
  public int omJ;
  public String omK;
  public String omL;
  public int scene;
  public int tXe;
  public String tXi;
  public String tXj;
  public String tXk;
  public int tXl;
  
  public ig()
  {
    GMTrace.i(19146695770112L, 142654);
    GMTrace.o(19146695770112L, 142654);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19146829987840L, 142655);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.omK == null) {
        throw new b("Not all required fields were included: receiver_openid");
      }
      if (this.tXi == null) {
        throw new b("Not all required fields were included: qrcode_id");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.omK != null) {
        paramVarArgs.e(2, this.omK);
      }
      if (this.tXi != null) {
        paramVarArgs.e(3, this.tXi);
      }
      paramVarArgs.fk(4, this.scene);
      if (this.tXj != null) {
        paramVarArgs.e(5, this.tXj);
      }
      if (this.omE != null) {
        paramVarArgs.e(6, this.omE);
      }
      paramVarArgs.fk(7, this.tXe);
      paramVarArgs.fk(8, this.ePH);
      if (this.omL != null) {
        paramVarArgs.e(9, this.omL);
      }
      if (this.omF != null) {
        paramVarArgs.e(10, this.omF);
      }
      if (this.tXk != null) {
        paramVarArgs.e(11, this.tXk);
      }
      paramVarArgs.fk(12, this.tXl);
      paramVarArgs.fk(13, this.omJ);
      GMTrace.o(19146829987840L, 142655);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.omK != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.omK);
      }
      i = paramInt;
      if (this.tXi != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tXi);
      }
      i += b.a.a.a.fh(4, this.scene);
      paramInt = i;
      if (this.tXj != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tXj);
      }
      i = paramInt;
      if (this.omE != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.omE);
      }
      i = i + b.a.a.a.fh(7, this.tXe) + b.a.a.a.fh(8, this.ePH);
      paramInt = i;
      if (this.omL != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.omL);
      }
      i = paramInt;
      if (this.omF != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.omF);
      }
      paramInt = i;
      if (this.tXk != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.tXk);
      }
      i = b.a.a.a.fh(12, this.tXl);
      int j = b.a.a.a.fh(13, this.omJ);
      GMTrace.o(19146829987840L, 142655);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.omK == null) {
        throw new b("Not all required fields were included: receiver_openid");
      }
      if (this.tXi == null) {
        throw new b("Not all required fields were included: qrcode_id");
      }
      GMTrace.o(19146829987840L, 142655);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ig localig = (ig)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19146829987840L, 142655);
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
          localig.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19146829987840L, 142655);
        return 0;
      case 2: 
        localig.omK = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19146829987840L, 142655);
        return 0;
      case 3: 
        localig.tXi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19146829987840L, 142655);
        return 0;
      case 4: 
        localig.scene = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19146829987840L, 142655);
        return 0;
      case 5: 
        localig.tXj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19146829987840L, 142655);
        return 0;
      case 6: 
        localig.omE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19146829987840L, 142655);
        return 0;
      case 7: 
        localig.tXe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19146829987840L, 142655);
        return 0;
      case 8: 
        localig.ePH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19146829987840L, 142655);
        return 0;
      case 9: 
        localig.omL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19146829987840L, 142655);
        return 0;
      case 10: 
        localig.omF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19146829987840L, 142655);
        return 0;
      case 11: 
        localig.tXk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19146829987840L, 142655);
        return 0;
      case 12: 
        localig.tXl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19146829987840L, 142655);
        return 0;
      }
      localig.omJ = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(19146829987840L, 142655);
      return 0;
    }
    GMTrace.o(19146829987840L, 142655);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */