package http4k.k8s.model.io.k8s.api.core.v1

import kotlin.String

data class Volume(
	val awsElasticBlockStore: AWSElasticBlockStoreVolumeSource?,
	val azureDisk: AzureDiskVolumeSource?,
	val azureFile: AzureFileVolumeSource?,
	val cephfs: CephFSVolumeSource?,
	val cinder: CinderVolumeSource?,
	val configMap: ConfigMapVolumeSource?,
	val csi: CSIVolumeSource?,
	val downwardAPI: DownwardAPIVolumeSource?,
	val emptyDir: EmptyDirVolumeSource?,
	val ephemeral: EphemeralVolumeSource?,
	val fc: FCVolumeSource?,
	val flexVolume: FlexVolumeSource?,
	val flocker: FlockerVolumeSource?,
	val gcePersistentDisk: GCEPersistentDiskVolumeSource?,
	val gitRepo: GitRepoVolumeSource?,
	val glusterfs: GlusterfsVolumeSource?,
	val hostPath: HostPathVolumeSource?,
	val iscsi: ISCSIVolumeSource?,
	val name: String,
	val nfs: NFSVolumeSource?,
	val persistentVolumeClaim: PersistentVolumeClaimVolumeSource?,
	val photonPersistentDisk: PhotonPersistentDiskVolumeSource?,
	val portworxVolume: PortworxVolumeSource?,
	val projected: ProjectedVolumeSource?,
	val quobyte: QuobyteVolumeSource?,
	val rbd: RBDVolumeSource?,
	val scaleIO: ScaleIOVolumeSource?,
	val secret: SecretVolumeSource?,
	val storageos: StorageOSVolumeSource?,
	val vsphereVolume: VsphereVirtualDiskVolumeSource?
)
