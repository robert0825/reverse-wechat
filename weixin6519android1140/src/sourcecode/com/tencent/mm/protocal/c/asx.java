package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class asx
  extends com.tencent.mm.bm.a
{
  public String desc;
  public String jxH;
  public String name;
  public String rgY;
  public String rgZ;
  public String title;
  public int uIP;
  public String uIQ;
  
  public asx()
  {
    GMTrace.i(20860656156672L, 155424);
    GMTrace.o(20860656156672L, 155424);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20860790374400L, 155425);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.name != null) {
        paramVarArgs.e(1, this.name);
      }
      if (this.title != null) {
        paramVarArgs.e(2, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.e(3, this.desc);
      }
      if (this.jxH != null) {
        paramVarArgs.e(4, this.jxH);
      }
      paramVarArgs.fk(5, this.uIP);
      if (this.uIQ != null) {
        paramVarArgs.e(6, this.uIQ);
      }
      if (this.rgY != null) {
        paramVarArgs.e(7, this.rgY);
      }
      if (this.rgZ != null) {
        paramVarArgs.e(8, this.rgZ);
      }
      GMTrace.o(20860790374400L, 155425);
      return 0;
    }
    if (paramInt == 1) {
      if (this.name == null) {
        break label668;
      }
    }
    label668:
    for (int i = b.a.a.b.b.a.f(1, this.name) + 0;; i = 0)
    {
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.title);
      }
      i = paramInt;
      if (this.desc != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.desc);
      }
      paramInt = i;
      if (this.jxH != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jxH);
      }
      i = paramInt + b.a.a.a.fh(5, this.uIP);
      paramInt = i;
      if (this.uIQ != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uIQ);
      }
      i = paramInt;
      if (this.rgY != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.rgY);
      }
      paramInt = i;
      if (this.rgZ != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.rgZ);
      }
      GMTrace.o(20860790374400L, 155425);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(20860790374400L, 155425);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        asx localasx = (asx)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(20860790374400L, 155425);
          return -1;
        case 1: 
          localasx.name = locala.yqV.readString();
          GMTrace.o(20860790374400L, 155425);
          return 0;
        case 2: 
          localasx.title = locala.yqV.readString();
          GMTrace.o(20860790374400L, 155425);
          return 0;
        case 3: 
          localasx.desc = locala.yqV.readString();
          GMTrace.o(20860790374400L, 155425);
          return 0;
        case 4: 
          localasx.jxH = locala.yqV.readString();
          GMTrace.o(20860790374400L, 155425);
          return 0;
        case 5: 
          localasx.uIP = locala.yqV.nj();
          GMTrace.o(20860790374400L, 155425);
          return 0;
        case 6: 
          localasx.uIQ = locala.yqV.readString();
          GMTrace.o(20860790374400L, 155425);
          return 0;
        case 7: 
          localasx.rgY = locala.yqV.readString();
          GMTrace.o(20860790374400L, 155425);
          return 0;
        }
        localasx.rgZ = locala.yqV.readString();
        GMTrace.o(20860790374400L, 155425);
        return 0;
      }
      GMTrace.o(20860790374400L, 155425);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\asx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */